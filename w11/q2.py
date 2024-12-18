from decimal import Decimal, getcontext
getcontext().prec = 102
sqrt_2 = Decimal(2).sqrt()
result = str(sqrt_2)[:102]
print()
print("result question 1")
print(result)
from fractions import Fraction
result = Fraction(1, 2) + Fraction(1, 3)
print()
print("result question 2")
print(result)
from sympy import symbols, expand
x,y = symbols('x y')
expression = (x + y)*6
expanded_expression = expand(expression)
print()
print("result question 3")
print(expanded_expression)
from sympy import symbols, simplify, sin, cos
x = symbols('x')
expression = sin(x) / cos(x)
simplified_expression = simplify(expression)
print()
print("result question 4")
print(simplified_expression)
