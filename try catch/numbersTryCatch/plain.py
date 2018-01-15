# nutrients facts reader
# by leandro trinidad
# V 1.0
# TODO: add check feature
#   > check if the values are correct before puting in spreadsheet
# TODO: error checking
#   > check for errors
#

#librarys
try:
    import Image
except ImportError:
    from PIL import Image
import pytesseract # image to text
import openpyxl # spreadsheet stuff
import numbers
import re


#check if a value is an int or float
def isfloat(x):
    try:
        a = float(x)
    except ValueError:
        return False
    else:
        return True

def isint(x):
    try:
        a = float(x)
        b = int(a)
    except ValueError:
        return False
    else:
        return a == b

# items that i am looking for is in this dictionary
# add more if you eant to look for more stuff
items = {"CALORIES" :      "Unknown"  ,
         "FAT" :           "Unknown"  ,
         "SATURATED" :     "Unknown"  ,
         "TRANS" :         "Unknown"  ,
         "CHOLESTEROL" :   "Unknown"  ,
         "SODIUM" :        "Unknown"  ,
         "POTASSIUM" :     "Unknown"  ,
         "CARBOHYDRATE" :  "Unknown"  ,
         "SUGARS" :        "Unknown"  ,
         "PROTEIN" :       "Unknown"  ,
         "IRON" :          "Unknown"  ,
         "VITAMIN A":      "Unknown"  ,
         "VITAMIN C":      "Unknown"  ,
         "VITAMIN D":      "Unknown"  ,
         "CALCIUM":        "Unknown"  ,
         "FIBRE":          "Unknown"}
#opens a workbook
spreadFile = "workbook.xlsx" # the name of the spreadsheet
wb = openpyxl.load_workbook(spreadFile)
sheet = wb.worksheets[0]

# gets the product name
product_name = input("Product Name: ")

for item in items:
    sheet.append(input(item))
#saves the file
wb.save(spreadFile)

# xy = coordinate_from_string('A4') # returns ('A',4)
# col = column_index_from_string(xy[0]) # returns 1
# row = xy[1]
