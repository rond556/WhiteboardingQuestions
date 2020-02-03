public class StockBuyIn {


    //An array represents time
    //the value of the array is the value of a stock at that moment in time
    //you must buy in, and you must sell
    //find the largest profit margin or the least losses
    //[2, 7, 6, 1, 8, 6, 3]
    //

    public int findBiggestDifference (int[] stockTime){
        if(stockTime.length < 2) {
            throw new NullPointerException();
        }
        int biggestDifference = Integer.MIN_VALUE;
        int smallestBuyIn = stockTime[0];



        for(int i = 0; i < stockTime.length - 1; i++){
            if(stockTime[i] < smallestBuyIn){
                smallestBuyIn = stockTime[i];
            }
            if(stockTime[i + 1] - stockTime[i] > biggestDifference){
                biggestDifference = stockTime[i + 1] - stockTime[i];
            }
        }
        return biggestDifference;
    }



}
