package edu.nazarov.two_pointers;

/*
Дан массив, состоящий из букв 'X', 'Y' и 'O'. Необходимо найти кратчайшее расстояние между двумя буквами 'X' и 'Y',
либо вывести 0, если 'X' либо 'Y' отсутствуют.
Дистанция между двумя рядом стоящими буквами считается как 1 (одно межбуквенное расстояние)
Дистанция может считаться в обе стороны.

Примеры:
- "XY" -> 1
- "YX" -> 1
- "OOOXOOYOXO" -> 2
- OOOXXOY -> 2
 */
public class YaXYMinDistanceSolution {
    public int minDistance(String string) {
        int xPos = -1;
        int yPos = -1;

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == 'X') {
                xPos = i;
            } else if (c == 'Y') {
                yPos = i;
            }
            if (xPos != -1 && yPos != -1) {
                minDistance = Math.min(minDistance, Math.abs(xPos - yPos));
            }
        }

        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
