weight = int(input("Weight? "))
unit = input("(L)bs or (K)g? ")

if unit.lower() == "l":
	weight = weight * 0.45
	print(f"You are {weight} Kg")
elif unit.lower() == "k":
	weight = weight * 2.2
	print(f"You are {weight} Lbs")
else:
	print("Invalid Input")
