#! /usr/bin/python

#Generates an SQLite contract in Java. Meant to be used with a phpmyadmin exported sql file (is not very robust, will not work with any .sql file)

import StringIO, re, sys

def writeTable(f, tablename, tabledef):
	f.write("\tpublic static abstract class ")
	f.write(tablename.upper() + "_Entry implements BaseColumns {\n")
	f.write('\t\tpublic static final String TABLE_NAME = "' + tablename + '";\n')
	s = StringIO.StringIO(tabledef)
	reg = re.compile(r".*`(.*)`.*")
	reg_ignore = re.compile(r"\s+KEY\s+")
	for line in s:
		ignore = reg_ignore.search(line)
		if ignore != None:
			continue
		column = reg.search(line)
		if column == None:
			continue
		#print column.group(1)
		column = column.group(1)
		f.write('\t\tpublic static final String COLUMN_NAME_' + column.upper() + ' = "' + column + '";\n')
	f.write("\t}\n")
	


if len(sys.argv) < 5:
	quit()

packagename = sys.argv[1]
classname = sys.argv[2]
infile = open(sys.argv[3], 'r')
outfile = open(sys.argv[4] + "/" + sys.argv[2] + ".java", 'w')


outfile.write("package " + packagename + ";\n\n")
outfile.write("import android.provider.BaseColumns;\n\n")
outfile.write("/* This file was auto-generated by " + sys.argv[0] + ".\n Abandon all hope ye who edit here.*/\n\n")
outfile.write("public final class " + classname + " {\n\n\tpublic " + classname + "() {};\n\n") 



tabledef = ''
tablename = ''
tablenames = []
intable = False
reg = re.compile(r".*`(.*)`.*")

for line in infile:
	if line.startswith("CREATE"):
		intable = True
		tablename = reg.search(line).group(1)
		tabledef = ''
	elif line.startswith(")"):
		intable = False
		writeTable(outfile, tablename, tabledef)
		tablenames.append(tablename)
		outfile.write("\n")
	else:
		tabledef = tabledef + line

infile.seek(0)

outfile.write("\n\tpublic static final String SQL_CREATE_ENTRIES = ")
lastline = ''
for line in infile:
	if len(lastline) > 0:
		outfile.write('\t\t"' + lastline.rstrip("\r\n") + '\\n" + \n')
	lastline = ''
	for c in line:
		if c == '\\':
			lastline = lastline + "\\\\"
		elif c == '"':
			lastline = lastline + '\\"'
		else:
			lastline = lastline + c;
outfile.write('\t\t"' + lastline.rstrip("\r\n") + '";\n')

outfile.write("\n\tpublic static final String SQL_DELETE_ENTRIES = ")
lastline = ''
for table in tablenames:
	if len(lastline) > 0:
		outfile.write('\n\t\t"DROP TABLE IF EXISTS \'' + lastline + '\'\\n" +')
	lastline = table
outfile.write('\n\t\t"DROP TABLE IF EXISTS \'' + lastline + '\'";\n')

outfile.write("\n}\n")






outfile.close()

