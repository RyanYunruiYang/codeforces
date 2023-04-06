import random
import math


def P(old,new,temp):
	if new<old:
		return 1.0
	return math.exp((old-new)/temp)

def main():
	s = random(state)

	best = s

	while(elapsed_time <= time_limit):
		t = temperature(elapsed_time/time_limit)

		nextstate = neighbor(s)

		if value(s)< value(best):
			best = s

		if(P(value(s),value(next),t)>= randdom.random()):
			s = nextstate

	print(value(best))	

if __name__ == "__main__":
	main()