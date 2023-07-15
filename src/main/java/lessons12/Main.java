package lessons12;

class Main {
    public static void main(String[] args) {
        Storage<Integer, String> house = new Storage<>();
// квартира и имя жильца
        house.put(22, "German");
        house.put(31, "Serhii");
        house.put(20, "Svetlana");


 //       System.out.println(house);
        house.put(20, "Svetlana");
 //       System.out.println(house);

//        System.out.println(house.getSize());
        System.out.println(house.get(22));
    }


}