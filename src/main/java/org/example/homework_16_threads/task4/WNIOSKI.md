1. Wybralem liste bo tworze konta tylko na poczatku dzialania programu  
   i nie potrzebuje synchronizacji np. dodawania do listy przez rozne watki.
   ID jest rowne pozycji w liscie wiec nie musze uzywac mapy


2. Globalną cechą jest id konta bo kazde ma unikatowe i mozna je w latwy
   sposob ze soba porownac


3. tryLock rozni sie tym, ze jak watek nie dostanie locka to nie czeka na niego 
   w nieskonczonosc wiec pozbywamy sie przy tym ewentualnego zakleszczenia


4. AtomicReference podmienia stan jedynie jednego obiektu przez co gdy wykonuje
   sie przelew to inny watek i tak moze zobaczyc stan "posredni" przelewu


5. Widac nazwy watkow ktore spowodowaly zakleszczenie

```text
Found one Java-level deadlock:
=============================
"pool-1-thread-1":
waiting to lock monitor 0x00007f7ce40011b0 (object 0x000000071a0a14d8, a org.example.homework_16_threads.task4.BankAccount),
which is held by "pool-1-thread-4"

"pool-1-thread-4":
waiting to lock monitor 0x00007f7cf00013a0 (object 0x000000071a0a15d0, a org.example.homework_16_threads.task4.BankAccount),
which is held by "pool-1-thread-7"

"pool-1-thread-7":
waiting to lock monitor 0x00007f7ce4000ff0 (object 0x000000071a0a1528, a org.example.homework_16_threads.task4.BankAccount),
which is held by "pool-1-thread-1"
