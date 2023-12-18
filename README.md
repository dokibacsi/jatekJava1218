# JavaJatek

Szerializálás (serializable)<br>
Tervezési minta (design pattern)<br>

A probléma:<br>
<br>
Egy labirintusban szobáról szobára lehet menni elágazó útvonalakkal.
Egy szobából egy, vagy több másik szobába lehet mozogni és egy szobához több útvonal is vezethet.<br>
<br>
Megoldás:<br>
<br>
Egy "Szoba" osztályban egy dictionary-ben lementjük, hogy melyik irány melyik másik szobába vezet.
