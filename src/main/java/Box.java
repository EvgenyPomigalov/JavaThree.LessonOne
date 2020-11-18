import java.util.ArrayList;


public class Box {

    private ArrayList<Fruit> fruitBox;
    private Class<? extends Fruit> type;
//Добавление фруктов
    public void addFruit(Fruit fr, int number) {
        if (this.fruitBox == null) {
            // Если коробка пустая, то определяем ее как коробку с определенными фруктами
            this.type = fr.getClass();
            this.fruitBox = new ArrayList<Fruit>();
        }
        //Если коробка не пустая и содержит другие фрукты, то выводим сообщение
        else if (this.type != fr.getClass() && this.type != null) {
            System.out.println("Нельзя смешивать фрукты");
            return;
        }
        //Добавляем фрукты
        this.type = fr.getClass();
        for (int i = 1; i <= number; i++) {
            this.fruitBox.add(fr);
        }
        System.out.println("Добавлено " + number + " " + fr.getClass().getName());
    }
    //Считаем вес
    public double getWeigth(){
        return fruitBox.size() * (fruitBox.size()>0 ? fruitBox.get(0).getWeigth() : 0);
    }
    //Сравниваем вес
    public boolean compareWeigth(Box box){
        return this.getWeigth() == box.getWeigth();
    }
    //Пересыпаем в другую, если фрукты одинаковые или целевая коробка пустая
    // объявляем коробку пустой
    public void toOther (Box box) {
        if (this.type == box.type || box.type == null) {
                box.addFruit(this.fruitBox.get(0), this.fruitBox.size());
                this.fruitBox.clear();
                this.type = null;
            }
        else {
            System.out.println("Нельзя смешивать фрукты");
        }

    }
}
