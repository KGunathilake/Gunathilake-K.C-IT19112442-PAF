package utils;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class RandomID {
	
	public int getuniqueid(){
		Random rand = new Random();
		int maxNumber = 1000000;
		int randomNumber = rand.nextInt(maxNumber) + 1;
		
		return randomNumber;
	}
}
