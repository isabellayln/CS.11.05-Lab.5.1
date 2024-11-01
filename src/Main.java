import java.awt.geom.Area;
import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int sum = 0;
        for(int i: totalWasteKgPerCapitaPerYear) sum +=i;
        return (int) Math.round((sum/totalWasteKgPerCapitaPerYear.length)+0.5);
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        int sum = 0;
        for (int i: householdEstimatesKgPerCapitaPerYear)
            sum +=i;
        return (int)
                Math.round(((double) sum /householdEstimatesKgPerCapitaPerYear.length)+0.5);
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        int sum = 0;
        for (int i : householdEstimatesTonnesPerYear) {
            sum += i;
        }
        return (int)(10 * Math.round((double)sum / householdEstimatesTonnesPerYear.length)) / 10;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int sum = 0;
        for (int i:retailEstimatesKgPerCapitaPerYear)
        {
            sum += i;
        }
        return (int) Math.round(sum * 1.0 / retailEstimatesKgPerCapitaPerYear.length);

    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int sum = 0;
        for (int i:retailEstimatesTonnesPerYear){
            sum += i;
        }
        return (int) Math.round(sum*1.0/retailEstimatesTonnesPerYear.length);
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        if(foodServiceEstimatesKgPerCapitaPerYear == null || foodServiceEstimatesKgPerCapitaPerYear.length == 0){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i<(foodServiceEstimatesKgPerCapitaPerYear.length); i++){
            sum = sum + foodServiceEstimatesKgPerCapitaPerYear[i];
        }
        return sum/foodServiceEstimatesKgPerCapitaPerYear.length+1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        int result = 0;
        for(int food : foodServiceEstimatesTonnesPerYear){
            result += food;
        }
        return result/foodServiceEstimatesTonnesPerYear.length+1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int result = 0;
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        if(totalWasteKgPerCapitaPerYear.length%2==1){
            result = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
        }
        else if(totalWasteKgPerCapitaPerYear.length%2==0){
            int num1 = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length/2];
            int num2 = totalWasteKgPerCapitaPerYear[(totalWasteKgPerCapitaPerYear.length/2) + 1];
            result = (num1 + num2) / 2;
        }
        return result;

    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        int median = 0;
        Arrays.sort(householdEstimatesKgPerCapitaPerYear);
        int middleNum = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length/2];
        if(householdEstimatesKgPerCapitaPerYear.length%2 == 0){
            int afterMiddle = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length/2+1];
            median = (middleNum + afterMiddle)/2;
        }
        else{
            median = middleNum;
        }
        return median;

    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        Arrays.sort(householdEstimatesTonnesPerYear);
        int length = householdEstimatesTonnesPerYear.length;
        int median;
        if(length%2==0) {
            median = (householdEstimatesTonnesPerYear[length / 2 - 1]) + (householdEstimatesTonnesPerYear[length / 2]) / 2;
        }
        else{
            median = householdEstimatesTonnesPerYear[length/2];
        }
        return median;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        Arrays.sort(retailEstimatesKgPerCapitaPerYear);
        int median = 0;
        int shorten = retailEstimatesKgPerCapitaPerYear.length/2;
        if (retailEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            median = (retailEstimatesKgPerCapitaPerYear[shorten] + retailEstimatesKgPerCapitaPerYear[(retailEstimatesKgPerCapitaPerYear.length/2)-1]) / 2;
        }
        else {
            median = retailEstimatesKgPerCapitaPerYear[shorten];
        }
        return median;

    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        Arrays.sort(retailEstimatesTonnesPerYear);
        int length = retailEstimatesTonnesPerYear.length;
        int med;
        if (length % 2 == 0) {
            med = (retailEstimatesTonnesPerYear[length / 2 - 1] + retailEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            med = retailEstimatesTonnesPerYear[length / 2];
        }
        return med;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        Arrays.sort(foodServiceEstimatesKgPerCapitaPerYear);
        int median = 0;
        int shorten = foodServiceEstimatesKgPerCapitaPerYear.length/2;
        if (foodServiceEstimatesKgPerCapitaPerYear.length % 2 == 0) {
            median = (foodServiceEstimatesKgPerCapitaPerYear[shorten] + foodServiceEstimatesKgPerCapitaPerYear[(foodServiceEstimatesKgPerCapitaPerYear.length/2)-1]) / 2;
        }
        else {
            median = foodServiceEstimatesKgPerCapitaPerYear[shorten];
        }
        return median;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        Arrays.sort(foodServiceEstimatesTonnesPerYear);
        int length = foodServiceEstimatesTonnesPerYear.length;
        int med;
        if (length % 2 == 0) {
            med = (foodServiceEstimatesTonnesPerYear[length / 2 - 1] + foodServiceEstimatesTonnesPerYear[length / 2]) / 2;
        } else {
            med = foodServiceEstimatesTonnesPerYear[length / 2];
        }
        return med;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int min = totalWasteKgPerCapitaPerYear[0];
        for(int i = 1; i<totalWasteKgPerCapitaPerYear.length; i++){
            if(totalWasteKgPerCapitaPerYear[i] < min){
                min = totalWasteKgPerCapitaPerYear[i];
            }
        }
        return min;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        int min = householdEstimatesKgPerCapitaPerYear[0];
        for(int i = 1; i<householdEstimatesKgPerCapitaPerYear.length; i++){
            if(householdEstimatesKgPerCapitaPerYear[i] < min){
                min = householdEstimatesKgPerCapitaPerYear[i];
            }
        }
        return min;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        Arrays.sort(householdEstimatesTonnesPerYear);
        int min = householdEstimatesTonnesPerYear[0];
        return min;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int min = retailEstimatesKgPerCapitaPerYear[0];
        for(int i = 1; i<retailEstimatesKgPerCapitaPerYear.length; i++){
            if(retailEstimatesKgPerCapitaPerYear[i] < min){
                min = retailEstimatesKgPerCapitaPerYear[i];
            }
        }
        return min;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int min = retailEstimatesTonnesPerYear[0];
        for(int i:retailEstimatesTonnesPerYear){
            if(i<min){
                min = i;
            }
        }
        return min;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        Arrays.sort(foodServiceEstimatesKgPerCapitaPerYear);
        int min = foodServiceEstimatesKgPerCapitaPerYear[0];
        return min;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        if (foodServiceEstimatesTonnesPerYear == null || foodServiceEstimatesTonnesPerYear.length == 0) {
            return -1;
        }


        int minEstimate = foodServiceEstimatesTonnesPerYear[0];
        for (int estimate : foodServiceEstimatesTonnesPerYear) {
            if (estimate < minEstimate) {
                minEstimate = estimate;
            }
        }

        return minEstimate;

    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        Arrays.sort(totalWasteKgPerCapitaPerYear);
        int max = totalWasteKgPerCapitaPerYear[totalWasteKgPerCapitaPerYear.length -1];
        return max;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        Arrays.sort(householdEstimatesKgPerCapitaPerYear);
        int max = householdEstimatesKgPerCapitaPerYear[householdEstimatesKgPerCapitaPerYear.length -1];
        return max;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        Arrays.sort(householdEstimatesTonnesPerYear);
        int max = householdEstimatesTonnesPerYear[householdEstimatesTonnesPerYear.length -1];
        return max;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int max = retailEstimatesKgPerCapitaPerYear[0];
        for(int elem : retailEstimatesKgPerCapitaPerYear){
            if( elem > max){
                max = elem;
            }
        }
        return max;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int max = retailEstimatesTonnesPerYear[0];
        for (int elem : retailEstimatesTonnesPerYear ){
            if (elem > max){
                max = elem;
            }
        }
        return max;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        int biggest = 0;
        for (int i = 0; i < foodServiceEstimatesKgPerCapitaPerYear.length; i++) {
            if (biggest < foodServiceEstimatesKgPerCapitaPerYear[i]) {
                biggest = foodServiceEstimatesKgPerCapitaPerYear[i];
            }
        }
        return biggest;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        int max = foodServiceEstimatesTonnesPerYear[0];
        for (int i : foodServiceEstimatesTonnesPerYear ){
            if (max < i){
                max = i;
            }
        }
        return max;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int totalWaste = 0;
        for(int i = 0; i<countries.length; i++){
            if(countries[i].equals(country)){
                totalWaste = totalWasteKgPerCapitaPerYear[i];

            }
        }
        return totalWaste;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        String finalWaste = "";
        int mostWaste = 0;
        int currentWaste = 0;
        for(int i = 0; i<countries.length; i++){
            currentWaste = totalWasteKgPerCapitaPerYear[i];
            if(currentWaste > mostWaste){
                mostWaste = currentWaste;
                finalWaste = countries[i];
            }
        }
        return finalWaste;
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        String[] highPoverty = new String[4];
        double[] highestPercentages = new double[4];
        int n = 0;

        for (int i = 0; i < countries.length; i++) {
            double currentPoverty = percentagesShareInPoverty[i];
            if (n < 4) {
                highPoverty[n] = countries[i];
                highestPercentages[n] = currentPoverty;
                n++;
            } else {
                double minPercentage = highestPercentages[0];
                int minIndex = 0;
                for (int j = 1; j < highestPercentages.length; j++) {
                    if (highestPercentages[j] < minPercentage) {
                        minPercentage = highestPercentages[j];
                        minIndex = j;
                    }
                }
                if (currentPoverty > minPercentage) {
                    highPoverty[minIndex] = countries[i];
                    highestPercentages[minIndex] = currentPoverty;
                }
            }
        }
        return Arrays.copyOf(highPoverty, n);
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences) {
        int count = 0;
        for (int i = 0; i < confidences.length; i++) {
            if (confidences[i].equals("High Confidence")) {
                count++;
            }
        }
        String[] highConfidenceCountries = new String[count];
        int index = 0;
        for (int i = 0; i < countries.length; i++) {
            if (confidences[i].equals("High Confidence")) {
                highConfidenceCountries[index] = countries[i];
                index++;
            }
        }
        return highConfidenceCountries;
    }

}

