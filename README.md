# Втора лабораториска вежба по Софтверско инженерство

## Никола Стојчевски, 186081 

### Control Flow Graph

[![SILab2](https://github.com/StojchevskiN/SI_lab2_186081/assets/165928667/2a7e4c60-87d4-4741-b444-2f417cafde56)](https://github.com/StojchevskiN/SI_lab2_186081/blob/master/SILab2.jpeg)

### Цикломатска комплексност

Овој код има цикломатска комплексност 7. Цикломатската комплексност е добиена преку збиронт на бројот на региони што во овој случај е 7.

### Тест случаи според критериумот Every Branch

(1) A-1-B  
(2) A-2-C-1-D-1-E-1-F-1-G-1-H-2-I  
(3) A-2-C-1-D-1-E-1-F-2-H-1-J-1-K-1-L-1-M-1-N  
(4) A-2-C-1-D-1-E-1-F-2-H-1-J-1-K-1-L-1-M-2-O-1-K-2-P-1-Q-1-S-1-T-1-U-1-D-2-V-1-W  
(5) A-2-C-1-D-1-E-1-F-2-H-1-J-1-K-1-L-1-M-2-O-1-K-2-P-2-R-1-S-2-1-U-1-D-2-V-2-X  

### Тест случаи според критериумот Multiple Condition за условот: if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0').




|    Combination    |   Possible   Test   Case    {item.getPrice() , item.getDiscount() , item.getBarcode()} |  
|---|---|  
|         FXX       |  150 ,  2 , 52489654218|  
|         TFX       |  400 ,  0 , 52489654218|  
|         TTF       |  400 , 20 , 52489654218|  
|         TTT       |  400 , 20 , 025124153689|  

