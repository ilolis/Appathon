# Appathon

Εργασία του Ηλία Λώλη στο μάθημα Διαδίκτυο και Εφαρμογές. 


## Περιγραφή της εργασίας
Με την παρούσα εργασία οπτικοποιούμε το usage του τηλεπικοινωνιακού δικτύου στην πόλη της Θεσσαλονίκης 
σχεδιάζοντας 2 γραφήματα ξεχωριστά. Το ένα γράφημα οπτικοποιεί τον αριθμό των χρήσεων ανά ημέρα του Νοεμβρίου
και το δεύτερο chart οπτικοποιεί τα συνολικά GB (upload & download) στο δίκτυο. 

Ο χρήστης μπορεί να επιλέξει ποιο Municipality τα δεδομένα του θέλουν να αφορούν 
και η σελίδα ανανεώνεται αυτόματα. 

## Deploy
To project είναι βασισμένο στο Spring που τρέχει σε JRE. 

Το project δουλεύει με την Open Source Version openjdk-14.0.2 και σε Windows 10.

Για να τρέξετε το Project θα πρέπει:
1) Download and install το openjdk-14.0.2
2) JAVA_HOME να κοιτάει στον φάκελο του openjdk-14.0.2.
3) Μέσα στον src φάκελο τρέχουμε mvnw clean install (μόνο Windows)
4)  Μέσα στον src φάκελο τρέχουμε mvnw spring-boot:run (μόνο Windows)
5) Διαθέσιμο internet για να κατεβούν τα dependencies.
6) Μεταβένουμε στο localhost:8080 ή αν εχει αλλαχτεί το default port χρησιμοποιούμε αυτό που αλλάξαμε.
Το project δεν εχει τεσταριστεί σε άλλες versions της JAVA ή άλλο λειτουργικό σύστημα εκτός των Windows 10.

