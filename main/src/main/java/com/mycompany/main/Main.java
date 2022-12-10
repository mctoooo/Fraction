/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

import java.util.ArrayList;

/**
 * @author Администратор
 */
public class Main {

    public static void main(String[] args) {
        try {
            Fraction drobA = null; //ссылка
            Fraction drobB = null; //ссылка
            Fraction drobC = null; //ссылка
            Fraction drobD = null; //ссылка*/
// Fraction.Nod(45, 30);
// изменяем флаг на уровне класса,при этом сокрящаться будут все дроби
//Fraction.setflagCl(true);
            Fraction.setflagCl(false);
            drobA = new Fraction(44, 44);
            drobA.setflagObj(true);
            System.out.println(drobA.toFormatString());

            drobA = new Fraction(4, 44);
            System.out.println(drobA.toFormatString());

            drobA = new Fraction(64, 12);
            System.out.println(drobA.toFormatString());
//drobA.add(drobD);

            drobA = new Fraction(44, 23);
            drobB = new Fraction(-38, -24);
            drobC = new Fraction(10, 40);
            drobD = new Fraction(-50, 40);
// изменяем флаг на уровне объекта,при этом сокрящаться будут все дроби при математических действиях
//без сокращения результатов математических действий

            drobD.setflagObj(true);
            System.out.println("drobD + flagObj=true " + drobD.toFormatString());
            Fraction drobFo = drobA.multiplication(drobC);
            System.out.println("drobA * drobC = " + drobFo.toFormatString());
// изменяем флаг на уровне класса,при этом сокрящаться будут все дроби 
// и результаты математических действий

            drobC.setflagObj(true);
            System.out.println("drobC + flagObj=true " + drobD.toFormatString());
            drobFo = drobA.multiplication(drobC);
            System.out.println("drobA * drobC = " + drobFo.toFormatString());

//массив объектов

            Fraction[] ftArr = null;
            ftArr = new Fraction[10]; // массив ссылок из 10 элементов
            for (int ix = 0; ix < ftArr.length; ix++) {
                ftArr[ix] = new Fraction(ix, ix + 1);
            }
//  for-each

            for (Fraction fx : ftArr) {
                if (fx == null)
                    System.out.println("null");
                else
                    System.out.println(fx.toFormatString());
            }

            System.out.println("Count of Objects = " + Fraction.getCountObject());

            if (drobA == drobB)
                System.out.println("Equal");
            else
                System.out.println("Not Equal");

            if (drobA.isEqual(drobB))
                System.out.println("Equal");
            else
                System.out.println("Not Equal");


            Fraction drobF = drobA.add(drobB);
            System.out.println("drobA + drobB = " + drobF.toFormatString());
//System.out.println("Count of Objects = "+ Fraction.getCountObject());
            drobF = drobA.dev(drobB);
            System.out.println("drobA / drobC = " + drobF.toFormatString());
//System.out.println("Count of Objects = "+ Fraction.getCountObject());
            drobF = drobA.subtraction(drobC);
            System.out.println("drobA - drobC = " + drobF.toFormatString());
//System.out.println("Count of Objects = "+ Fraction.getCountObject());
            drobF = drobA.multiplication(drobC);
            System.out.println("drobA * drobC = " + drobF.toFormatString());

            drobF = drobA.add(drobB.add(drobC.add(drobD)));
            drobF = ((drobA.add(drobB)).add(drobF)).add(drobF);//.add(drobC.add(drobD)));
            System.out.println("Count of Objects = " + Fraction.getCountObject());
            System.out.println(drobF.toFormatString());

            drobD = drobF;
            System.out.println(drobD.toFormatString());
            drobD.setCh(1);
            drobD.setZn(2);
            System.out.println(drobF.toFormatString());
            drobD.CopyFraction(drobF);

// System.out.println("Count of Objects = "+ Fraction.getCountObject());
// System.out.println("Count of Objects = "+ Fraction.getCountObject());

            ArrayList<Fraction> arrLstF = new ArrayList<Fraction>();//Создаем объект. Вызваем коструктор по умолчанию;
            ArrayList<String> cars = new ArrayList<String>();

            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");

            System.out.println(cars);
            Fraction d = new Fraction(3, 5);
            // Fraction d = null;
            arrLstF.add(new Fraction(3, 5));
            arrLstF.add(new Fraction(1, 3));
            arrLstF.add(new Fraction(2, 3));
            arrLstF.add(new Fraction(1, 2));
            arrLstF.add(new Fraction(3, 5));
            System.out.println(arrLstF);
            System.out.println(arrLstF.indexOf(d));
            System.out.println(arrLstF.lastIndexOf(d));

//    for(int ix=0;ix <10; ix++)
//    {
//        arrLstF.add(new Fraction());
//    }
            //System.out.println(cars);

            //System.out.println(arrLstF);

     // В ArrayList сохраняем множество объектов Fraction

            ArrayList<Fraction> arrLstFr = new ArrayList<Fraction>();

            for (int ix = 0; ix < 10; ix++) {
                arrLstFr.add(new Fraction(24,135));
                arrLstFr.add(new Fraction(5 + ix + (int) (Math.random() * 12 * ix), 8 + ix + (int) (Math.random() * 13 * ix)));
                arrLstFr.add(new Fraction(24,135));
                arrLstFr.add(new Fraction(22,133));
                arrLstFr.add(new Fraction(24,115));
                arrLstFr.add(new Fraction(24,135));
            }
            System.out.println(arrLstFr);
            int size=arrLstFr.size();
            int LastIx=0;
            for ( int ix =0 ; ix < size;ix++){
                LastIx=arrLstFr.lastIndexOf(arrLstFr.get(ix));

                    while (ix < LastIx) {
                        arrLstFr.remove(LastIx);
                        LastIx=arrLstFr.lastIndexOf(arrLstFr.get(ix));
                }
                arrLstFr.trimToSize();
                size= arrLstFr.size();
            }
            System.out.println(arrLstFr);
            } catch (Exception e) {
            System.out.println("The Error detectid " + e.getMessage());
        }
    }
}