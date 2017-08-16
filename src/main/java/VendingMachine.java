public class VendingMachine {

    private final CashBox cashBox;
    private final Products products;

    VendingMachine(CashBox cashBox, Products products){
        this.cashBox = cashBox;
        this.products = products;
    }

    public String execute(String input) {
        for(int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'D') {
                cashBox.insertDollar();
            }
            if (input.charAt(i) == 'Q') {
                cashBox.insertQuarter();
            }
            if (input.charAt(i) == 'd') {
                cashBox.insertDime();
            }
            if (input.charAt(i) == 'N') {
                cashBox.insertNickel();
            }
            if (input.charAt(i) == 'P') {
                cashBox.insertPenny();
            }
        }
        return cashBox.returnMoney();
    }
}
