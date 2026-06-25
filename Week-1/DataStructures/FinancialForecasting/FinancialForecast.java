class FinancialForecast{

    public static double predict(double growthrate,int year,double currentvalue){
        if(year==0){
            return currentvalue;
        }
        return predict(growthrate,year-1,currentvalue*(1+growthrate));
    }


    public static void main(String []args){
        int year=5;
        double growthrate=0.08;
        double currentvalue=10000;
        //Calculate c=new Calculate();
        System.out.print(FinancialForecast.predict(growthrate,year,currentvalue));
    }
}