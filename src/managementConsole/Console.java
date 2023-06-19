package managementConsole;

import com.sun.org.apache.xpath.internal.operations.Lt;
import model.*;
import model.base.Bill;
import repos.BankRepos;
import repos.BillRepos;
import repos.ClientRepos;
import service.TimeBooster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Console {

    BankRepos bankRepos;
    ClientRepos clientRepos;
    BillRepos billRepos;

    public Console(BankRepos bankRepos, ClientRepos clientRepos, BillRepos billRepos) {

        this.bankRepos = bankRepos;
        this.billRepos = billRepos;
        this.clientRepos = clientRepos;


    }

    public void run() {

        System.out.println("Для выбора введите номер строки");
        System.out.println("1) Выбрать созданные    2) Создать объекты");
        System.out.println("");


        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equals("1")) {
            chooseReady(scanner);


        } else if (input.equals("2")) {
            chooseCreation();
        } else {
            System.out.println("Неверный ввод");
        }


        // 1
        // 2

    }


    public void chooseEntity(Scanner scanner) {  // выбор клиента/счета/банк/операции

        String input = scanner.next();


    }

    public void chooseReady(Scanner scanner) {

        // bankRepos;                                    // передать, а не создавать
        // billRepos;
        // clientRepos;


        ClientRepos clientRepos = new ClientRepos();
        BillRepos billRepos = new BillRepos();

        TimeBooster timeBooster = new TimeBooster();
        timeBooster.setBillRepos(billRepos);


        CentralBank centralBank = new CentralBank("Central", 3, 1000000, new ArrayList<>());

        Bank bank1 = new Bank("Sber", 4, 100000, new ArrayList<>());
        Bank bank2 = new Bank("Tinkoff", 2, 200000, new ArrayList<>());
        Bank bank3 = new Bank("Alpha", 3, 3000000, new ArrayList<>());
        Bank bank4 = new Bank("Vtb", 3, 100000, new ArrayList<>());

        Client client1 = new Client(bank1, "kan", "ye", "zelenaja st, 224, ap.6", 1342342341);
        Client client2 = new Client(bank2, "we", "st", "belaja st, 19, ap.7", 332233221);
        Client client3 = new Client(bank3, "q", "w", "chernaja st, 11, ap.9", 334433229);
        Client client4 = new Client(bank3, "A", "d", "rozovaja st, 13, ap.12", 33553222);
        Client client5 = new Client(bank4, "Z", "e", "sinaja st, 1, ap.1", 333454279);
        Client client6 = new Client(bank4, "V", "r", "oranzhevaja st, 3, ap.2", 334666229);


        bank1.clientAdder(client1);
        bank2.clientAdder(client2);
        bank3.clientAdder(client3);
        bank3.clientAdder(client4);
        bank4.clientAdder(client5);
        bank4.clientAdder(client6);


        DebitBill bill1 = new DebitBill(client1);
        CreditBill bill2 = new CreditBill(client1);
        DepositBill bill3 = new DepositBill(client1);

        DebitBill bill4 = new DebitBill(client2);
        CreditBill bill5 = new CreditBill(client2);
        DepositBill bill6 = new DepositBill(client2);

        DebitBill bill7 = new DebitBill(client3);
        CreditBill bill8 = new CreditBill(client3);
        DepositBill bill9 = new DepositBill(client3);

        DebitBill bill10 = new DebitBill(client4);
        CreditBill bill11 = new CreditBill(client4);
        DepositBill bill12 = new DepositBill(client4);


        bankRepos.saveAll(bank1, bank2, bank3, bank4);
        clientRepos.saveAll(client1, client2, client3, client4, client5, client6);
        billRepos.saveAll(bill1, bill2, bill3, bill4, bill5, bill6, bill7, bill8, bill9, bill10, bill11, bill12);

        List banklist = bankRepos.getBankList();
        List clientlist = clientRepos.getСlientList();
        List billList = billRepos.getBillList();


        String input = scanner.next();
        System.out.println("1) списки; 2) операции");
        if (input.equals("1")) {                  // списки
            lists(banklist, clientlist, billList, scanner);


        } else if (input.equals("2")) {
            listOfOperations();
        }


    }

    public void lists(List<Bank> bankList, List<Client> clientList, List<Bill> billList, Scanner scanner) {             // списки банков; клиентов; счетов

        System.out.println("1) Список банков");
        System.out.println("2) Список клиентов");
        System.out.println("3) Список счетов");

        String input = scanner.next();
        if (input.equals("1")) {
            listOfBanks(bankList, scanner);
        } else if (input.equals("2")) {
            listOfClients(clientList);
        } else if (input.equals("3")) {
            listofBills(billList);
        }

    }

    public void listOfBanks(List<Bank> bankList, Scanner scanner) {

        String input = scanner.next();

        for (int i = 0; i < bankList.size(); i++) {

            int bankNumb = 1;
            bankList.get(i).getId();

            System.out.print(bankNumb);
            System.out.println((bankList.get(i)).getId());


            bankNumb = bankNumb + 1;
        }

        if (input.equals("1")) {
            bankList.get(0);


        }


    }

    public void listOfClients(List<Client> ClientList) {

        //вывести список
        // выбрать банк
        // инфо о нем

    }

    public void listofBills(List<Bill> BillList) {

        //вывести список
        // выбрать клиента
        // инфо о нем

    }

    public void centralBankInfo(CentralBank centralBank) {

        // инфо о цб

    }

    public void listOfOperations() {

        System.out.println("1) перевод");
        System.out.println("2) пополнение");
        System.out.println("3) снятие");
        System.out.println("4) история транзакций");
        System.out.println("5) отмена операции");
        System.out.println("6) ускоритель времени");
        System.out.println("5) уведомления");


    }

    public void transfer() {

        //вызвать метод трансфер

    }

    public void withdrawal() {

        //вызвать метод withdrawal

    }

    public void replenishment() {

        //вызвать метод replnishment

    }

    public void transactHistory() {

        //вызвать метод getTransactionList   - история всех транзакций
        //вызвать метод getTransactionById   - посмотреть конкретную транзакцию

    }

    public void transactCancel() {

        //вызов метода TransferCancel

    }

    public void timeBooster() {

        //вызвать TimeBooster

    }

    public void notifications() {

        //вызвать метод sendNotifications

    }


    public void chooseCreation() {


    }

    public void createBank(String name, double percent, double capital, List<Client> listOfClients) {

        Bank bank = new Bank(name, percent, capital, listOfClients);

    }

    public void createClient(Bank bank, String firstName, String lastName, String address, long passportNumb) {

        Client client = new Client(bank, firstName, lastName, address, passportNumb);

    }

    public void createBill() {

        // Bill bill = new Bill();
        // bill.id = UUID.randomUUID();

    }

    public void createBankList(Bank... banks) {

        List<Bank> bankList = new ArrayList<>();

        if (bankList.size() < banks.length) {            // saveAll

        }

    }

    public void createClientList(Client... clients) {

    }

    public void createBillList(Bill... bills) {

    }


}
