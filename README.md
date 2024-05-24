# Balon-Patlatma-Oyunu
1)	Node class’ı oluşturarak data(int) ve next(Node) oluşturdum. Node’dan nesne oluşturmak için constructor oluşturdum. 
2)	balonPozisyonuBul fonksiyonunu yazdım. Bu fonksiyonda önce bir node oluşturup head‘ini 1 olarak belirleyip kullanıcının girmiş olduğu N bilgisi kadar node oluşturdum. 
3)	İlk oluşturulan node’un head’ini son oluşturulan node’un next’ine atayarak son node ve ilk node’u birbirine bağladım.
4)	Kullanıcının girmiş olduğu M bilgisi doğrultusunda M-1 kadar balon atlayarak M pozisyonundaki balonu listeden sildim. 
5)	Head ve bu head’in next’ini atama yaparak düzenleyip bunların bir while döngüsü içerisinde ikisinin eşit olmadığı durumlarda devam etmek koşuluyla, sırasıyla patlatılan balonları yazdırdım. 
6)	Head ve bu head’in next’i birbirine eşit olduğunda döngüsünden çıkmak için koşul koydum çünkü ilk node’un head’i ve son node’un next’i birbirinin aynısı ise bu iki node aslında aynı node’dur. Son bir balon kaldığı için kalan son balonun pozisyonunu yazdırdım.
7)	Main fonksiyonunu yazdım. İlk önce boolean bir değer oluşturarak true değerini atadım.
8)	yeniOyun true olduğu sürece kullanıcıdan toplam balon sayısı (N) ve patlatma işlemine kaçıncı balondan başlanacağı(M) bilgisini aldım. 
9)	balonPozisyonuBul fonksiyonunu  çağırarak parametrelerini atadım.
10)	Program çalıştıktan sonra kullanıcıya bir seçenek sunarak yeni oyuna başlaması için ‘Evet’ yazmasını, bitirmek içinse enter tuşuna basmasını söyledim. Kullanıcı ‘evet’ girdiği sürece yeniOyun true olacak. Kullanıcı enter tuşuna basarsa program sonlanacak.
