package HomeWork002;

public class View {
    public void showMainMenu(){
        System.out.println("Выберети действие\n" +
                            "1 весь список людей\n" +
                            "2 родители по id \n" +
                            "3 бабушки и дедушки по id \n" +
                            "4 дети по id \n" +
                            "5 внуки по id \n" +
                            "0 выход\n");
    }

    public void showReturnMenu(){
        System.out.println("Выход в меню 0");
    }

    public void showMenuSelectionId(){
        System.out.println("Для поиска родственников введите Id  ");
    }

    public void showError(){
        System.out.println("Ошибка");
    }

    public void showText(String text){
        System.out.println(text);
    }
}

