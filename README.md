# Task 5
Fifth learning task from subject PB162 on [FI MUNI](https://www.fi.muni.cz/)

## Task description (Czech language only)

### Co je potřeba znát
-   `equals()` a `hashCode()`
-   práci s kolekcemi

### Popis úlohy

Úloha simuluje nákupní košík a obchod, ve kterém si zákazníci nakupují
výrobky. K dispozici máte třídu `Product` představující výrobek, třídu
`Customer` představující zákazníka a testy, které testují základní
funkčnost. Testy pro domácí část jsou zakomentované.

Pokud není řečeno jinak, žádnou z předdefinovaných tříd/rozhraní
neměňte!

### Zadání pro cvičení (3 body)

-   Do třídy `Product` přidejte metodu `equals()`. Metoda bude fungovat
    tak, že dva produkty jsou si rovny, pokud mají stejný název a cenu.
-   Do třídy `Product` přidejte metodu `hashCode()` tak, aby byla v
    souladu s `equals()`.
-   Vytvořte třídu `se.terhol.ShoppingCartImpl` implementující rozhraní
    `ShoppingCart`. Třída bude používat vhodnou kolekci (tedy ne pole!).
    Pro vracení nemodifikovatelné kolekce v metodě `getProducts()` viz
    třída `Collections`.

### Zadání na doma (3 body)

-   Upravte třídu `Customer` tak, aby si dva zákazníci byli rovni, pokud
    mají stejné jméno (ignorujte fakt, že to v reálu nedává moc smysl).
-   Vytvořte třídu `ShopImpl` implementující rozhraní `Shop`. Třída si
    pamatuje nákupní košíky všech zákazníků, kteří zrovna nakupují.
    Zatímco tedy `ShoppingCart` obsahuje informace o nákupu jednoho
    zákazníka, `Shop` má přehled o všech zákaznících během jejich
    nákupu.

## License
MIT