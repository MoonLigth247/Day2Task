# 📌 DAY 2 Дадлага
![image](https://github.com/user-attachments/assets/f3463bd8-ae3b-4059-8f07-4eaec18ae1f6)

    Дасгал 2 LeetCode : Salary Increase 
  Өгүүлбэр : ABC компани нь ажилчидийнхаа цалинг нэмэхээр шийджээ . Доорх самбарын дагуу нэмэгдэнэ :
  
    Цалин                            Нэмэгдэх хувь         
   
    0 - 400.00                              15%

    400.01 - 800.00                         12%

    800.01 - 1200.00                        10%

    1200.01 - 2000.00                        7%

    2000.00ooc их                            4%


     Оролт :

     Гараас бодит тоон утга орно .

     Гаралт  :
     3 мөр мэссэж хэвлэгдэх бөгөөд эхний мөрөнд шинэ цалин дараагийн мөрөнд нэмэгдсэн мөнгөн дүн 
     
     3дахь мөрөнд хэдэн хувиар нэмэгдсэн гэдэг нь гарч ирнэ .

![image](https://github.com/user-attachments/assets/ba6e1ecd-495e-4cdd-b9fa-0a8a8c89a9bb)


     Дасгал 3 Beecrowd :  Design Parking System 

    Машины зогсоолын зогсоолын системийг төлөвлөх. Зогсоол нь том, дунд, жижиг гэсэн гурван төрлийн зогсоолтой
    бөгөөд хэмжээ тус бүртээ тодорхой тооны зогсоолтой.

ParkingSystem ангиллыг хэрэгжүүлэх:

ParkingSystem(int big, int medium, int small) ParkingSystem ангийн объектыг эхлүүлнэ. Машины зогсоол тус бүрийн үүрний тоог бүтээгчийн нэг хэсэг болгон өгсөн болно.
bool addCar(int carType) Зогсоол руу орохыг хүссэн машинд carType төрлийн зогсоол байгаа эсэхийг шалгана. carType нь 1, 2, 3 гэсэн том, дунд, жижиг гэсэн гурван төрөлтэй байж болно. Машин нь зөвхөн машины төрлийн зогсоол дээр зогсох боломжтой. Хэрэв зай байхгүй бол худал гэж буцаана, үгүй ​​бол тэр хэмжээний зайд машинаа байрлуулаад үнэнийг буцаана.
Оролт



["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]

[[1, 1, 0], [1], [2], [3], [1]]

Гаралт

[null, true, true, false, false]


Тайлбар

ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);

parkingSystem.addCar(1); // return true because there is 1 available slot for a big car

parkingSystem.addCar(2); // return true because there is 1 available slot for a medium car

parkingSystem.addCar(3); // return false because there is no available slot for a small car

parkingSystem.addCar(1); // return false because there is no available slot for a big car. It is already occupied.


  ![image](https://github.com/user-attachments/assets/c614bfca-153d-4f7d-b940-449c38b7d69a)
