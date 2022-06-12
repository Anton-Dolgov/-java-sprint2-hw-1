import java.util.Scanner;
// Слышали недавно рёв в небе? это моя кукуха пролетала, а вам котика
//,.｡='`1
//　　　　 .,,..;~`''''　　　　`''''＜``彡　}
//　 _...:=,`'　　 　︵　 т　︵　　X彡-J
//＜`　彡 /　　ミ　　,_人_.　＊彡　`~
//　 `~=::　　　 　　　　　　 　　　Y
//　　 　i.　　　　　　　　　　　　 .:
//　　　.\　　　　　　　,｡---.,,　　./
//　　　　ヽ　／ﾞ''```\;.{　　　 ＼／
//　　　　　Y　　　`J..r_.彳　 　|
//　　　　　{　　　``　　`　　　i
//　　　　　\　　　　　　　　　＼　　　..︵︵.
//　　　　　`＼　　　　　　　　　``ゞ.,/` oQ o`)
//　　　　　　`i,　　　　　　　　　　Y　 ω　/
//　　　　 　　`i,　　　 　　.　　　　"　　　/
//　　　　　　`iミ　　　　　　　　　　　,,ノ
//　　　　 　 ︵Y..︵.,,　　　　　,,+..__ノ``
//　　　　　(,`, З о　　　　,.ノ川彡ゞ彡　　＊
//　　　　　 ゞ_,,,....彡彡~　　　`+Х彡彡彡彡*
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReportService reportService = new ReportService();
        int userInput = 0;

        while (true) {
            printMenu();
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    reportService.readMonthlyFiles();
                    break;
                case 2:
                    reportService.readYearlyFile();
                    break;
                case 3:
                    reportService.reconciliation();
                    break;
                case 4:
                    reportService.monthlyReportInfo();
                    break;
                case 5:
                    reportService.yearlyReportInfo();
                    break;
                case 6:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Считать все месячные отчёты");
        System.out.println("2 - Считать годовой отчёт");
        System.out.println("3 - Сверить отчёты");
        System.out.println("4 - Вывести информацию о всех месячных отчётах");
        System.out.println("5 - Вывести информацию о годовом отчёте");
        System.out.println("6 - Выход");
    }
}