public class Card {
public StringtoString() {
        String printedCard
        printedCard + = "B\tI\tN\tG\tO\n";
        for(int r = 0; r < 5 r++) {
            for(int c = 0; c < 5 c++) {
                printedCard + = grid[r][c] + "\n";
            }
        }
    }
}