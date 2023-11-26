data_integer  = 10
print("angka: ", data_integer,", merupakan data ", type(data_integer))

data_float = 1.5
print("angka: ", data_float,", merupakan data ", type(data_float))

data_string = "cobaja"
print("kata: ", data_string,", merupakan data ", type(data_string))

data_boolean = True
print("statement: ", data_boolean,", merupakan data ", type(data_boolean))

data_complex = complex(5,6)
print("angka: ", data_complex,", merupakan data ", type(data_complex))

from ctypes import c_double, c_char, c_long

data_double = c_double(10.5)

print("==========COBA C==========")
print("angka: ", data_double,", merupakan data ", type(data_double))

cobafloat = 5.9
cobajadiint = int(cobafloat)
cobajadistring = str(cobafloat)
cobajadidouble = c_double(cobafloat)
print("cobafloat: ", cobafloat,", merupakan data ", type(cobafloat))
print("cobajadiint: ", cobajadiint,", merupakan data ", type(cobajadiint))
print("cobajadidouble: ", cobajadidouble,", merupakan data ", type(cobajadidouble))

print("==========COBA STRING==========")
nilaistring = ""

cobajadibool = bool(nilaistring)
print("cobajadibool: ", cobajadibool,", merupakan data ", type(cobajadibool))