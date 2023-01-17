package Geometry;

import java.util.Scanner;

public class main {



    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        var name = scan.nextLine();
        Figures figure = Figures.SQUARE;
        Figure figure1 = new Figure();

        figure1 = figure1.createFigure(figure);

    }


}
