/* Problem: This program is about making simple projections for how much revenue a small movie theater can make. The situation is the movie theater can only seat 60 people with social distancing concerns. It asks the user how many shows there will be and how many people per show. Next, the program uses random numbers and statistics from Google to determine how much the ticket price (12% of audience population are children, 75% are adults, 13% are seniors) is and how much their food price was (based on statistic that 73% of ppl bought food at their last movie visit). The users that are confirmed to have bought something automatically buy 1 item, with a chance for a second item (this is super simplified. no different sizes or anything, if they bought candy its price x, if they bought a drink its price y). Finally, the program displays the number of people per show, the ticket revenue, snack revenue and all totals for the shows/entire day. 
PSEUDOCODE
* import util package
* display on screen the intro: You bought a movie theater with 255 seats on February 1st, 2020. Surprise! Coronavirus sweeps the nation in March. The maximum audience we can have is 60 while following social distancing. Being the savvy programming hobbyist that you are, you decide to run some projections. First, how many shows will there be and how many people are you estimating will show up to the show?
* create Scanner object, numShows variable
* call getShows method, pass Scanner as an argument, store result in numShows variable

getShows method
* create variable shows, initialize to zero
* initiate do while loop, repeats the following indented steps while user input is greater than 8 and less than 1
    * display on screen, "Shows: "
    * wait for response
    * store input in the shows variable
    * retrieve value in shows variable from storage
    * test to see if shows is an integer between 8 and 1
* retrieve value in shows variable from storage
* return the value in shows to main

Main method
* create numPeople array reference variable (int)
* retrieve the value in the numShows variable
* call getPeople method, pass Scanner and numShows value as an arguments, store result in numPeople reference variable

getPeople method
* retrieve value in the param variable movieTimes
* create ppl array object, set size equal to the value in movieTimes
* create variable folks, initialize to zero
* initiate for loop - iterates through the length of the ppl array
    * check to see if loop should run - is counter variable i less than length of ppl array?
    * initiate do while loop, repeates following indented steps while user input is greater than 60 and less than 0
        * display on screen, "People: "
        * wait for response
        * store input in the folks variable
        * retrieve value in folks variable from storage
        * test if folks variable is an integer between 60 and 0
    * retrieve value in folks variable from storage
    * copy the value in the folks variable to the ppl[i] array position
    * add 1 to the counter variable i
* retrieve the address of the ppl array
* return the address of the ppl array to main method

Main Method
* create ageIndex reference variable for 2D array (int)
* retrieve the address of the numPeople array
* call getTicketType method, pass address of the ageIndex array as an argument, store resulting address in ageIndex reference variable

getTicketType method
* retrieve address of the param array called population
* create ticketTypes reference variable for 2D array, set ROW size equal to the length of the population array
* initiate outer for loop - iterates through the length of the population array
    * check to see if loop should run - is the counter variable i less than the length of the population array?
    * retrieve value in the population[i] position
    * set the COLUMN size of the ticketTypes[i] array equal to the value in the population[i] position
    * initiate inner for loop - iterates through the length of the ticketTypes[i] array
        * check to see if loop should run - is counter variable j is less than the length of the ticketTypes[i] array?
        * call the getRandom() method, pass 100 as an argument, store the resuling value in the ticketTypes[i][j] position
        * add 1 to the counter variable j
    * add 1 to the counter variable i
* retrieve address of the ticketTypes array
* return address to main

getRandom method
* create Random object, store the address in the reference variable called randomNumber
* retrieve value stored in param variable named limit
* return a random integer between 0 and limit - 1

Main method
* create ticketPrices reference variable for 2D array (double)
* retrieve the address of the ageIndex array
* call getTicketPrice method, pass address of the ageIndex array as an argument, store resulting address in ticketPrices reference variable

getTicketPrice method
* retrieve address of the param array called ageFigures
* create tickets reference variable for 2d double array, set ROW size to the length of the ageFigures array
* initiate outer for loop - iterates through each movie showing
    * check to see if loop should run, is counter variable i less than the length of the ageFigures array?
    * retrieve value in the ageFigures[i] position
    * set the COLUMN size of the tickets[i] array equal to the length of the ageFigures[i] array
    * initiate inner for loop - iterates through each person at the movie
        * check to see if loop should run, is counter variable i less than the length of the tickets array?
        * retrieve the value in the ageFigures[i][j] position
        * evaluate if the value in ageFigures[i][j] is greater or equal to 0 AND less than or equal to zero, store 10.69 in the array tickets[i][j]
        * evaluate if the value in ageFigures[i][j] is greater or equal to 12 AND less than or equal to 87, store 13.69 in the array tickets[i][j]
        * store 12.69 in array tickets[i][j] for any other scenario
        * add 1 to the counter variable j
    * add 1 to the counter variable i
* retrieve address of the param array tickets
* return address to main

Main method
* create buyer reference variable for 2D array (boolean)
* retrieve the address of the numPeople array
* call didTheyBuy method, pass address of the numPeople array as an argument, store resulting address in buyerProbility reference variable

didTheyBuy method
* retrieve address of param array totalPeople
* create buy reference variale, set ROW size to the length of the totalPeople array
* create rand variable, initialize to 0
* initiate outer for loop - iterates through each movie
    * check to see if loop should run - is counter variable i less than the length of buy array
    * retrieve value in the totalPeople[i] array
    * set the COLUMNS of the buy[i] array to the value in totalPeople[i]
    * initiate inner for loop - iterates through each person at that show
        * check to see if counter varible j is less than the length of buy[i] array
        * call the gerRandom method, pass 100 as an argument, store result in rand variable
        * retrieve value held by rand variable
        * evaluate if value of rand is greater than or equal to zero AND the value is less than or equal to 73, set buy[i][j] to "true"
        * evaluate if value is any other number, set buy[i][j] equal to false
        * add 1 to the counter variable j
    * add 1 to the counter variable i
* retrieve address in the buy reference variable
* return address in buy variable to main

Main method
* create snackIndexes reference variable for 3D array (int)
* retrieve the address of the buyer array
* call getSnackIndexes method, pass address of the buyer array as an argument, store resulting address in snackIndexes reference variable

getSnackINdexes
* retrieve address of the buyOrNots param
* create reference variable for 3D array called snacks, set (pages? whatever the equivalent is. not rows, not columns? number of shows) equal to length of buyOrNots
* initiate outer for loop - iterates through each show
    * check to see if loop should run - is counter i less than the length of buyOrNots param
    * retrieve address of the buyOrNots array
    * set ROWS size of the snacks[i] array equal to the length of buyOrNots[i] and the COLUMNS size to 2
    * initiate middle loop - iterates through each person (buyOrNots[i])
        * check to see loop should run - is counter j less than the length of buyOrNots[i]
        * initiate inner loop - iterates through each snack a person can have (2 tops)
            * check to see if loop should run, is counter k less than 2?
            * evaluate if buyOrNots[i][j] is equal to false, store 4 in snacks[i][j][k]
            * evaluate if buyOrNots[i][j] is equal to true AND if the value in counter k is 0
                * call the getRandom method passing 4 as an argument, storing the result in snacks[i][j][k]
            * evaluate if buyOrNots[i][j] is equal to true AND if the value in counter k is 1
                * call the getRandom method passing 5 as an argument, storing the result in snacks[i][j][k]
            * add 1 to counter variable k
        * add 1 to counter variable j
    * add 1 to counter variable i
* retrieve address held by reference variable snacks
* return address of snacks to main

Main method
* create snackPrices reference variable for 3D array (double)
* retrieve the address of the snackIndexes array
* call getSnackPrices method, pass address of the snackIndexes array as an argument, store resulting address in snackPrices reference variable

getSnackPrices
* retrieve address of the snackNums param
* create reference variable for 3D array called prices, set size  equal to length of snackNums array
* initiate outer for loop - iterates through each show
    * check to see if loop should run - is counter i less than the length of snackNums param
    * retrieve address of the snackNums array
    * set ROWS size of the prices[i] array equal to the length of snackNums[i] and the COLUMNS size to 2
    * initiate middle loop - iterates through each person (snackNums[i])
        * check to see loop should run - is counter j less than the length of snackNums[i]
        * initiate inner loop - iterates through each snack a person can have (2 tops)
            * check to see if loop should run, is counter k less than 2?
            * evaluate if snackNums[i][j][k] is equal to 0, store 8.10 in prices[i][j][k]
            * evaluate if snackNums[i][j][k] is equal to 1, store 4.49 in prices[i][j][k]
            * evaluate if snackNums[i][j][k] is equal to 2, store 7.15 in prices[i][j][k]
            * evaluate if snackNums[i][j][k] is equal to 3, store 6.29 in prices[i][j][k]
            * evaluate if snackNums[i][j][k] is any other value, then continue to next iteration
            * add 1 to counter variable k
        * add 1 to counter variable j
    * add 1 to counter variable i
* retrieve address held by reference variable prices
* return address of prices to main

Main method
* create snackTotals reference variable for 3D array (double)
* retrieve the address of the snackPrices array
* call getSnackTotals method, pass address of the snackPrices array as an argument, store resulting address in snackTotals reference variable

getSnackTotals method
* retrieve address of the snackRev param
* create reference variable for 2D array called total, set ROWS size equal to length of snackRev array
* initiate outer for loop - iterates through each show
    * check to see if loop should run - is counter i less than the length of snackRev param
    * retrieve address of the snackRev array
    * set COLUMNS size of the total[i] array equal to the length of snackRev[i]
    * initiate middle loop - iterates through each person (length of snackRev[i])
        * check to see loop should run - is counter j less than the length of snackRev[i]
        * initiate inner loop - iterates through each snack a person can have (2 tops)
            * check to see if loop should run, is counter k less than 2?
            * add the value in snackRev[i][j][k] to the value of total[i][j]
            * add 1 to counter variable k
        * add 1 to counter variable j
    * add 1 to counter variable i
* retrieve address held by reference variable total
* return address of total to main

Main method
* retrieve the addresses held by reference variables: numPeople, ticketPrices, snackTotals
* call the displayShowTotals method, pass addresses of numPeople, ticketPrices, and snackTotals as arguments

displayShowTotals method
* retrieve address stored in snackSum and ticketTotal param reference variables
* call the getArrayTotal method, pass address to snackSum reference variable as argument, store the result in variable grossSnackRevenue
* call the getArrayTotal method, pass address to ticketTotal reference variable as argument, store the result in variable grossTicketRevenue
* create double variables showTicketRev and showSnackRev, initialize to zero

getArrayTotal method - 2D double to primitive
* create double variable called twoArrayTotal, initialize to zero
* initiate outer for loop - iterates through the rows of a 2D array
    * check to see if loop should run - is counter variable i less than the length of param variable someTwoArray
    * initiate inner for loop - iterates through the columns of a 2D array
        * check to see if loop should run - is counter variable j less than the length ofvariable someTwoArray[i]
        * retrieve value in the variable someTwoArray[i][j]
        * add value in someTwoArray[i][j] plus the value in twoArrayTotal
        * add 1 to the counter variable j
    * add 1 to the counter variable i
* retrieve value stored in twoArrayTotal variable
* return value in twoArrayTotal variable

displayShowTotals method
* display on screen headers for table: "people - ticket rev - snack rev - gross rev" - do format later
* initiate for loop - iterates through each show
    * check to see if for loop should run - is counter i less than the length of the pplTotal param?
    * retrieve addresses for arrays: ticketTotal[i] and snackSum[i]
    * call the getArrayTotal method, pass addresses of ticketTotal[i]/snackSum[i] as arguments, store return value in showTicketRev and showSnackRev variables, respectively (see below, single array to primitive)
    * retrieve values from storage: pplTotal[i], showTicketRev, showSnackRev, i
    * display on screen, "[show [i + 1]] - [pplTotal[i]] - [showTicketRev] - [showSnackRev] - [add value in showTicketRev plus the value in showSnackRev]", format later
    * add one to counter variable
* retrieve values from storage: pplTotal, grossTicketRevenue, grossSnackRevenue
* display on screen, "[call the getArrayTotal method, pass pplTotal address as argument] - [grossTicketRevenue] - [grossSnackRevenue] - [add value in grossTicketRevenue plus the value in grossSnackRevenue]", format later

getArrayTotal method - single array to primitive (doubles, ints)
* create variable called arrayTotalInt, initialize to zero
* initiate for loop - iterates through length of param array someIntArray
    * check to see if loop should run - is counter variable i less than the length of someIntArray?
    * retrieve value held in someIntArray[i]
    * add value held in someIntArray[i] to the arrayTotalInt variable
    * add 1 to counter variable i
* retrieve value held in arrayTotalInt variable
* return value held in arrayTotalInt variable


*/

import java.util.*;


public class MovieTheater2 {
    public static void main(String[] args){

        // print intro to user
        System.out.println("You bought a movie theater with 255 seats on February 1st, 2020. Surprise! Coronavirus sweeps the nation in March. The maximum audience you can have is 60 while following the social-distancing policy. Being the savvy programming hobbyist that you are, you decide to run some projections. First, how many shows will there be and how many shows will there be and how many people per show?");

        // create scanner object
        Scanner keyboard = new Scanner(System.in);
        int numShows = getShows(keyboard);                                  // get number of shows

        int[] numPeople = getPeople(keyboard, numShows);                    // get number of ppl per show
        int[][] ageIndex = getTicketType(numPeople);                        // get the age index, based on % of ppl going to movies (children, adults, seniors)
        double[][] ticketPrices = getTicketPrice(ageIndex);                 // evaluate age index to determine ticket price
        boolean[][] buyer = didTheyBuy(numPeople);                          // determine if they bought food, based on %
        int[][][] snackIndexes = getSnackIndexes(buyer);                    // assign a snack index if they bought food
        double[][][] snackPrices = getSnackPrices(snackIndexes);            // evaluate snack index to determine snack price
        double[][] snackTotals = getSnackTotals(snackPrices);               // add up snack prices

        displayShowTotals(numPeople, ticketPrices, snackTotals);            // display revenue projections
    }

    /*
        displayShowTotals() shows a report of ppl, ticket revenues, snack revenues, and total revenues
        > params int[] pplTotal, double[][]ticketTotal, double[][]snackSum are addresses to array objects
        > calls the getArray total methods to add up values 

    */
    public static void displayShowTotals(int[] pplTotal, double[][] ticketTotal, double[][] snackSum){

        // create variables, call methods so we only call the getArrayTotal method once instead of twice
        double grossSnackRevenue = getArrayTotal(snackSum);
        double grossTicketRevenue = getArrayTotal(ticketTotal);
        double showTicketRev = 0;
        double showSnackRev = 0;

        // iterate through each show
        // call the getArrayTotals for each show, set equal to variables so we only call the methods once per iteration
        System.out.println("\t\tPeople\tTicket Revenue\tSnack Revenue\tGross Revenue\n");
        for (int i = 0; i < pplTotal.length; i++){
            showTicketRev = getArrayTotal(ticketTotal[i]);
            showSnackRev = getArrayTotal(snackSum[i]);
            System.out.printf("Show %d\t\t%d\t%.2f\t\t%.2f\t\t%.2f\n", i + 1, pplTotal[i], showTicketRev, showSnackRev, showTicketRev + showSnackRev);
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.printf("Totals:\t\t%d\t%.2f\t\t%.2f\t\t%.2f\n", getArrayTotal(pplTotal), grossTicketRevenue, grossSnackRevenue, grossTicketRevenue + grossSnackRevenue);
    }

    /*
        getArrayTotal() - calculates the total value in an array of ints
            > param int[] someArray is whatever int array I want the total for
            > return int arrayTotal is the total value in the array

    */
    public static int getArrayTotal(int[] someIntArray){

        int arrayTotalInt = 0;
        for (int i = 0; i < someIntArray.length; i++){
            arrayTotalInt += someIntArray[i];
        }
        return arrayTotalInt;
    }

    /*
    getArrayTotal() - calculates the total value in a single dimensional double array
        > param double[] someArray is whatever array I want the total for
        > return double arrayTotal is the total value in the array
    */

    public static double getArrayTotal(double[] someDoubleArray){

        double arrayTotalDouble = 0;
        for (int i = 0; i < someDoubleArray.length; i++){
            arrayTotalDouble += someDoubleArray[i];
        }
        return arrayTotalDouble;
    }

    /*
        getArrayTotal() - calculates the total value in a two dimensional double array
            > param double[][] someTwoArray is whatever 2d array I want the total for
            > return double twoArrayTotal is the total value in the array

    */
    public static double getArrayTotal(double[][] someTwoArray){

        double twoArrayTotal = 0;
        for (int i = 0; i < someTwoArray.length; i++){
            for (int j = 0; j < someTwoArray[i].length; j++){
                twoArrayTotal += someTwoArray[i][j];
            }
        }
        return twoArrayTotal;
    }

    /*
        getSnackTotals() - adds up the total in the snackPrices array
            > param double[][] snackRev is the snackPrices
            > return the address of the total array object
    */
    public static double[][] getSnackTotals(double[][][] snackRev){

        // set # of rows equal to # of shows in a day
        double[][] total = new double[snackRev.length][];

        // finish ragged array
        // outer loop # of shows
        // middle loop is each person
        // inner loop is each snack option
        for (int i = 0; i < snackRev.length; i++){
            total[i] = new double[snackRev[i].length];
            for (int j = 0; j < snackRev[i].length; j++){
                for (int k = 0; k < 2; k++){
                    total[i][j] += snackRev[i][j][k];
                }
            }
        }
        return total;
    }

    /*
        getSnackPrices() - evaluates the snack index and assigns a price. Prices come from https://movietheaterprices.com/amc-concession-prices/
            > param int[][][] snackNums is the index of the snacks
            > return address of double[][][] prices
                > 0 represents popcorn
                > 1 represents candy
                > 2 represents snacks - chicken tenders, nachos, whatever they serve at movie theaters
                > 3 represents drinks
                > 4 represents nothing. They only bought 1 item
    */
    public static double[][][] getSnackPrices(int[][][] snackNums){

        // add # of shows to array size
        double[][][] prices = new double[snackNums.length][][];

        // finish ragged array
        // outer loop # of shows
        // middle loop is each person
        // inner loop is each snack option, 4 means they didn't get anything, 0-3 are food options.
        for(int i = 0; i < snackNums.length; i++){
            prices[i] = new double[snackNums[i].length][2];
            for (int j = 0; j < snackNums[i].length; j++){
                for (int k = 0; k < 2; k++){
                    if (snackNums[i][j][k] == 0)
                    prices[i][j][k] = 8.10;
                    else if (snackNums[i][j][k] == 1)
                        prices[i][j][k] = 4.49;
                    else if (snackNums[i][j][k] == 2)
                        prices[i][j][k] = 7.15;
                    else if (snackNums[i][j][k] == 3)
                        prices[i][j][k] = 6.29;
                    else
                        continue;
                }  
            }
        }
        return prices;
    }

    /*
        getSnacks() - each person who buys food has 2 opportunities to buy food. The first opportunity they get a number between 0-3. Second opportunity is 0-7
            > param boolean[][] buyOrNots shows who buys/doesn't buy (each showing)
            > return address of int[][][] snacks which is the index of what type of snack EACH person at EACH showing bought.
                > 0 represents popcorn
                > 1 represents candy
                > 2 represents snacks - chicken tenders, nachos, whatever they serve at movie theaters
                > 3 represents drinks
                > 4 represents nothing. They only bought 1 item
    */
    public static int[][][] getSnackIndexes(boolean[][] buyOrNots){

        // create 3 dimensional array, create rows first (num of shows)
        int[][][] snacks = new int[buyOrNots.length][][];

        // finish ragged array
        // outer loop # of shows
        // middle loop is each person
        // inner loop is each snack option - 4 means they didn't get anything, 0-3 are food options. second food option has a chance of getting nothing
        for(int i = 0; i < buyOrNots.length; i++){
            snacks[i] = new int[buyOrNots[i].length][2];
            for (int j = 0; j < buyOrNots[i].length; j++){
                for (int k = 0; k < 2; k++){

                    if (buyOrNots[i][j] == false)
                        snacks[i][j][k] = 4;
                    else if (buyOrNots[i][j] == true && k == 0)
                        snacks[i][j][k] = getRandom(4);
                    else if (buyOrNots[i][j] == true && k == 1)
                        snacks[i][j][k] = getRandom(5);
                }
            }
        }
        return snacks;
    }

    /*
        didTheyBuy() - evaluates if the ticket holder bought concessions or not.
            > param int[] totalPeople is the number of people seeing the movie
            > return address to buy array object, which decides if they will buy something or not
        based on statistic that 73% of people bought something on their last movie visit
        Source: https://www.statista.com/statistics/581324/food-drink-buy-moviegoer/
    */
    public static boolean[][] didTheyBuy(int[] totalPeople){

        // declare # of rows, represents number of show times
        boolean[][] buy = new boolean[totalPeople.length][];
        int rand = 0;
        
        // iterate through each "movie showing", complete ragged array with # of ppl per show
        // iterate through each person to determin if they bought food or not
        for (int i = 0; i < buy.length; i++){
            buy[i] = new boolean[totalPeople[i]];

            for (int j = 0; j < buy[i].length; j++){
                
                rand = getRandom(100);
                if (rand  >= 0 && rand <= 73)
                    buy[i][j] = true;
                else
                    buy[i][j] = false;
            }
        }
        return buy;
    }

    /*
        getTicketPrice() - evaluates the random # to determine which ticket price to charge (done for each person at each show). children, adult, senior. Prices come from https://movietheaterprices.com/amc-ticket-prices/
            > param int[][] ageFigures represents the address of the ticket costs object
            > return int[][] tickets, the address of the ticket price array
        #'s based on who buys movie tickets: 12% children (ages 2-12), 75% adults (ages 13-59), 13% seniors (60+). 
        Source: https://www.motionpictures.org/wp-content/uploads/2018/03/MPAA-Theatrical-Market-Statistics-2016_Final-1.pdf
        Note: I adjusted these numbers slightly so they worked with ticket prices.
    */
    public static double[][] getTicketPrice(int[][] ageFigures){

        // declare # of rows, represents number of show times
        double[][] tickets = new double[ageFigures.length][];

        // iterate through each "movie showing", complete ragged array with # of ppl per show
        // add the appropriate ticket priced based on their random number
        for (int i = 0; i < ageFigures.length; i++){
            tickets[i] = new double[ageFigures[i].length];
            for (int j = 0; j < tickets[i].length; j++){
                if (ageFigures[i][j] >= 0 && ageFigures[i][j] <= 11)
                    tickets[i][j] = 10.69;
                else if (ageFigures[i][j] >= 12 && ageFigures[i][j] <= 87)
                    tickets[i][j] = 13.69;
                else
                    tickets[i][j] = 12.69;
            }
        }
        return tickets;
    }


    /*
        getRandom - creates a random number given a limit
            > param int limit sets how big the random number can be, return a random number between 0 and limit - 1
    */
    public static int getRandom(int limit){

        Random randomNumber = new Random();
        return randomNumber.nextInt(limit);
    }

    /*
        getTicketType() - assigns each person at each show a number between 0-99 (represents their age group for ticket prices)
            > param int[] population is address to the array holding the number of people at the movie PER SHOW
            > returns the address to the ticketTypes object
    */
    public static int[][] getTicketType(int[] population){

        // declare # of rows, represents number of show times
        int[][] ticketTypes = new int[population.length][];

        // iterate through each "movie showing", complete jagged array with # of ppl per show
        // assign random number for each person at each 
        for (int i = 0; i < population.length; i++){
            ticketTypes[i] = new int[population[i]];
            for (int j = 0; j < ticketTypes[i].length; j++){
                ticketTypes[i][j] = getRandom(100);
            }
        }
        return ticketTypes;
    }

    /*
        getPeople method - gets the number of people at each movie showing
            > @param scanner keys, gets input
            > @param int movieTimes, the number of times a movie is played in a day
            > @return int[] ppl, the address of a multidimensional array showing how many people are at each show
    */
    public static int[] getPeople(Scanner keys, int movieTimes){

        int[] ppl = new int[movieTimes];
        int folks = 0;

        // for loop gets # of columns each row has - number of ppl per show
        for (int i = 0; i < ppl.length; i++){
            do {
                System.out.print("People: ");
                folks = keys.nextInt();
            }
            while (folks > 60 || folks < 0);

            ppl[i] = folks;
        }
        return ppl;
    }

    /*
        getShows() gets how many movies are played in a day
            > parameter scanner scans - to get input
            > return int shows - the number of movies played in a day
            > validate input max 8 shows per day
    */
    public static int getShows(Scanner scans){

        int shows = 0;

        do {
            System.out.print("Shows: ");
            shows = scans.nextInt();
        }
        while (shows > 8 || shows < 1);

        return shows;
    }
}
