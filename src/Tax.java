public class Tax extends Field {
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);

    }

    @Override
    public String onLand(Player p) {
        String s = super.onLand(p);
        s += "\n Vil du betale fast beløb? Tast J for ja \n (Ellers trækker vi et beløb der svarer til 10 % af dine aktiver)";
        return s;
    }

    public int calculateAssets(Player p) {
        int cash = p.getBalance();
        return cash + p.getPropertyValues();
    }


    @Override
    protected String onAccept(Player p) {
        p.pay(this.cost);
        return p.getName() + " har nu betalt et fast beløb";
    }


    @Override
    protected String onReject(Player p) {

        float calcTax = p.getBalance()*0.1f;

        //calcTax += calculateAssets(Player p);
        float assets = calculateAssets(p);
        float calcTax1 = assets * 0.1f;

        p.pay((int) calcTax);

        return p.getName() + " Afviste at betale et fast beløb i skat. Vi har derfor trukket 10 % af " + p.getName() + "'s aktiver";