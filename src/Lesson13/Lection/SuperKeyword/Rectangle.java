package Lesson13.Lection.SuperKeyword;

import Lesson13.Lection.Override.Shape;

public class Rectangle extends Shape {
        private double lenght;
        private double wight;

        public Rectangle(double lenght, double wight) {
            this.lenght = lenght;
            this.wight = wight;
        }

        @Override
        public double calculateArea() {
            super.calculateArea();
            return super.calculateArea() + (lenght*wight);
        }
    }
