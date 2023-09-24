try {
        int d = 0;
        double catchedRes1 = intArray[8] / (double) d; // Используйте деление с плавающей точкой
        System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
        }
