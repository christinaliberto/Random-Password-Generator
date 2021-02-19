package random_password;

import java.util.Arrays;
import java.util.Random;

public class randomPassword {

    int randomNumber = (int)(Math.random() * 62);

    if (randomNumber >= 0 || randomNumber <=9) {
	randomNumber = randomNumber + 48;
    }

    if (randomNumber >= 10 || randomNumber <= 35) {
	randomNumber = randomNumber + 55;
    }

    if (randomNumber >= 36 || randomNumber <= 61) {
	randomNumber = randomNumber + 61;
    }
    
}
