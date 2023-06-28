<img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/repo_poster.png"></img>
![](https://img.shields.io/github/license/Soumabha-Banerjee/EnigmaticByte)  ![](https://img.shields.io/github/contributors-anon/Soumabha-Banerjee/EnigmaticByte)  ![](https://img.shields.io/github/last-commit/Soumabha-Banerjee/EnigmaticByte)  ![](https://img.shields.io/github/repo-size/Soumabha-Banerjee/EnigmaticByte)
# Project EnigmaticByte

This project comes with a **_GUI_** using which users can hide any message within an image and also they can retrieve the message from a stego image (which contains a message). This project **_implements a secure steganographic algorithm_** which is described in this document.

<a href="#documentation"><b>Click Here to see the documentation</b></a>

# How to install and run

> <b>Step 1</b>
<pre>
<a href="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/application/EnigmeticByte.jar">Click here</a> to install the <b>jar</b>.
</pre>
or
<pre>
Go to application >> Download <b>jar</b>.
</pre>

Also can clone this repository in the local machine by copying and pasting the anyone of the link given below in git bash
```
git clone https://github.com/Soumabha-Banerjee/EnigmaticByte.git
```
```
git@github.com:Soumabha-Banerjee/EnigmaticByte.git
```
```
gh repo clone Soumabha-Banerjee/EnigmaticByte
```

> <b>Step 2</b>

After performing Step 1, run main.java file with the latest Java compiler (Java 8 or above)

# How to Use

<ul>
  <li><b>How to hide a message inside a cover image</b></li>
  <br>
  <p align="justify">
  1. Run <b>main.java</b> file.<br>
  2. Go to <b>Encryption</b> tab.<br>
  3. Click on the <b>Upload Image</b> button and upload an image (must have .png or .jpg or .jpeg extension).<br>
  4. Write some message in the input box or can upload a text file (must have .txt extension) by clicking <b>Upload Message</b> button.<br>
  5. Write key (Maximum of 4 characters) in the key input box.<br>
  6. Now click on <b>Generate Stego Image</b> button.<br>
  7. Wait some time and then can see the stego image (which contains your message) in the <b>right sub-window</b>.<br>
  8. Now can save the stego image by clicking on <b>Save Stego Image</b> button.<br>
  </p>
  
  <img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/encryption_recording.gif"></img>
  <p align="center">(Guide) How to hide a message inside an image using EnigmaticByte</p>

  <li><b>How to retrieve message from an image</b></li>
  <br>
  <p align="justify">
    1. Run <b>main.java</b> file.<br>
    2. Go to <b>Decryption</b> tab.<br>
    3. Click on the <b>Upload Image</b> button and upload an image (must have .png or .jpg or .jpeg extension) from which you want to retrieve the message.<br>
    4. Write key (Maximum of 4 characters) in the key input box.<br>
    5. Now click on <b>Retrieve Message</b> button.<br>
    6. Wait some time and then result appears on the screen. If that image contains any message then it will be shown in the <b>right sub-window</b>.<br>
  </p>
  
  <img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/decryption_recording.gif"></img>
  <p align="center">(Guide) How to retrieve message from an image using EnigmaticByte</p>
  
  <li><b>Other functionalities</b></li>
  <br>
  <b>Generate Another Stego Image</b> - To reset the application. or To generate another stego image.<br>
  <b>About</b> - To show the application details and link to open source code.
</ul>

<a name="documentation"></a>
# Acknowledgement

<p align=justify>
It gives us immense pleasure to announce the completion of our project on <b>“A Secure Information Hiding Technique using Transposition Cipher and Steganography”</b> and we are pleased to acknowledge our indebtedness to all the persons who directly or indirectly contributed in the development of this work and who influenced our thinking, behavior and acts during the course of study. We are thankful to our <b><i>departmental Coordinator professor <a href="https://www.hetc.ac.in/faculty/dibyendu-samanta/">Mr. Dibyendu Samanta</a></i> (Assistant Professor and Coordinator, <a href="https://www.hetc.ac.in/">Hooghly Engineering and Technology College</a>)</b> who granted all the facilities of the college to us for the fulfilment of the project. We are thankful and express our sincere gratitude to our project guide <b><i>Mr. Dibyendu Samanta</i></b> who gave his/her valuable time to us for the sake of our project. He helped us each and every aspect of our project both academically and mentally. Without his support our project would not have seen the light of success.
</p>

> [Soumabha Banerjee](https://www.linkedin.com/in/soumabha-banerjee-48b045199/), CSE Dept., 8<sup>th</sup> Semester<br>
> University Roll No. – 17600119025<br>
> Academic Year 2022-‘23<br>

> [Sampurna Mallick](https://www.linkedin.com/in/sampurna-mallick-1256a2203/), CSE Dept., 8<sup>th</sup> Semester<br>
> University Roll No. – 17600119060<br>
> Academic Year 2022-‘23<br>

> [Sk Eshauddin](https://www.linkedin.com/in/sk-eshauddin-48a983202/), CSE Dept., 8<sup>th</sup> Semester<br>
> University Roll No. – 17600119040<br>
> Academic Year 2022-‘23<br>

> [Indrasish Das](), CSE Dept., 8<sup>th</sup> Semester<br>
> University Roll No. – 17600119008<br>
> Academic Year 2022-‘23<br>

# Abstract

<p align="justify">
Digital images are being exchanged over various types of networks. With the huge growth of computer networks and the latest advances in digital technologies, a huge amount of digital data is being exchanged over various types of networks. It is often true that a large part of this information is confidential, private or both, which increase the demand for stronger encryption techniques. Steganography is a preferred technique for protecting the transmitted data. It is used to hide information to perform encryption. Steganography techniques are getting significantly more sophisticated and have been widely used. These techniques are the perfect supplement for encryption that allows a user to hide large amounts of information within an image. It seeks to provide a covert communication channel between two parties. The objective of this project is to provide a secret and secured communication between people. Many different carrier file formats can be used, but digital images are the most popular because of their frequency on the Internet. This project simply hides a text message in an image file. For hiding secret information in images, there exist a large variety of steganographic techniques some are more complex than others and all of them have respective strong and weak points. Different applications have different requirements of the steganography technique used. For example, some applications may require absolute invisibility of the secret information, while others require a larger secret message to be hidden. This project intends to give an overview of cryptography, image steganography, their uses and techniques. In this proposed system Cryptography and Steganography are merged together. The contents of secret message are first kept secret by cryptography using columnar transposition ciphering; whereas in image steganography the encrypted messages as payload are embedded into the cover image using RGB based image steganography technique. The image steganography takes the advantage of human eye limitation. It uses color image as cover media for embedding secret message.The important quality of a steganographic system is to be less distortive while increasing the size of the secret message. In this project a method is proposed to embed the encrypted message into a color cover image.
</p>

# Table of Contents

1. [Introduction](#desc-1)
2. [Literature Review](#desc-2)
3. [System Requirements](#desc-3)
4. [Theoretical Background](#desc-4)
5. [Overview of Cryptography](#desc-5)
6. [Types of Cryptography](#desc-6)
7. [Overview of Steganography](#desc-7)
8. [Types of Steganography](#desc-8)
9. [Proposed Method](#desc-9)
10. [Histogram Analysis](#desc-10)
11. [Conclusion](#desc-11)
12. [Future Scopes](#desc-12)
13. [References](#desc-13)

<a name="desc-1"></a>
## Introduction
<p align="justify">
Steganography is defined as the art and science of writing hidden messages in such a way that no one else, apart from the intended recipient knows the existence of the message. The word “steganography” is basically of Greek origin which means “hidden writing”. The word is classified into two parts: “steganos” which means “secret” and “graphic” which means “writing”. However, in hiding information, the meaning of steganography is hiding text or secret messages into another media file such as image,
text, sound, or video. The word “steganography” is often considered similar to “cryptography” and “watermarking”. Whilst watermarking ensures message integrity and cryptography scrambles the message, steganography hides it. The primary objective of steganography is to avoid drawing attention to the transmission of hidden information. If suspicion is raised, then this objective has been planned to achieve the security of the secret message because if the hackers noted any change in the sent message, then this observer will try to know the hidden information inside the message.<br> 
The basic terminologies used in the steganography systems are the cover message, secret message, secret key, and embedding algorithm. The particular medium such as text, image, audio, video within which the message is to be hidden is known as cover medium.<br>
To provide an extra layer of security, the original message is also changed into some secret message and then it is hidden inside the cover medium. Finally, with the help of embedding algorithm secret message is hidden inside the cover medium. In steganography, before the hiding process, the sender must select an appropriate message carrier, an effective message to be hidden. A robust steganographic algorithm must be selected that should be able to embed the message more effectively. The sender then may send the hidden message to the receiver by using any of modern communication techniques. The receiver can extract the hidden message using the retrieval algorithm. This project proposes an algorithm to hide data inside an image using a secure steganographic technique.<br>
This project comprehends the following objectives –<br>
<pre>
1. Original message is converted into a secret message using a strong symmetric key cryptography algorithm. Here Columnar Transposition Ciphering is used.
2. Secret message is hidden inside the color cover image using LSB insertion technique.
3. To produce security tool based on steganographic techniques.
</pre>
</p>

<a name="desc-2"></a>
## Literature Review
<p align="justify">
In <a href="#p-1">[1]</a> Ako Muhammad Abdullah and Roza Hikmat Hama Aziz in their paper a Hash Least Significant Bit (H-LSB) with Affine cipher algorithm has been proposed for providing more security to data in a network environment. First we encrypt the data with the new cryptography algorithm and then embed in the image. Eight bits of the secret message are divided into 3, 3, 2 and embedding into the RGB pixels values of the cover image respectively. This system allows a message sender to select keys to encrypt the secret message before embedding into the image and a receiver is used the keys to decrypt the message. Receiver can be decrypted the encrypt message with incorrect the keys but to a different form from the original message. This system has the ability to provide better security while transferring the secret message from one end to the other end in network environment.<br>
In <a href="#p-2">[2]</a> Aumreesh Kumar Saxena, Dr. Sitesh Sinha, and Dr. Piyush Shukla proposes security technique for the confidential data which is the combination of three techniques, first is image compression that is based on wavelet transformation which will compress confidential image and reduce the size of the image, second is cryptography that is based on symmetric key which will encrypt the confidential image, and third is steganography that is based on least significant bit (LSB) which will embedded encrypted information inside a cover image.<br>
In <a href="#p-3">[3]</a> a new approach for LSB based image steganography using AES and RSA key is introduced by Chitra Biswas, Udayan Das Gupta and Md. Mokammel Haque. In this paper, hybrid cryptography has been applied using AES and RSA. Here the symmetric key used for message encryption is also encrypted. At the receiving side digital signature by encrypting the hash value of message is used for integrity checking. Then the encrypted message, encrypted symmetric key, and encrypted digest are combined together to form a complete message. This complete message again has been secured using the steganography method, LSB. <br>
In <a href="#p-4">[4]</a> Rosalina and Nur Hadisukmana proposed a new RGB shuffling method where all of RGB element is shuffled to distort the image in a manner such that distortion will be almost negligible. RGB Shuffling method will shuffle the RGB each pixel of image depends on the input password from user. The basic step of RGB shuffling is adding RGB element with ASCII password, invers and shuffle it.<br>
In <a href="#p-5">[5]</a> the work focuses on the enhancement of not only but also information security (which has become important in data storage and transmission, due to the widespread use of data exchange in electronic way) based on the combination of cryptography and steganography method. The image security is enhanced using Block-based transformation (for better robustness) and Blowfish Encryption technique (for encryption). Amongst various data hiding techniques provided by Steganography for information security LSB (Least Significant Bit) insertion is very popular as well as simple technique for embedding information into cover image.<br>
In <a href="#p-6">[6]</a> HAYFAA ABDULZAHRA, ROBIAH AHMAD and NORLIZA MOHD NOOR proposed a new method of hiding secret messages in the image, by combining steganography and cryptography. In order to lower the space of representing characters here a new Encryption technique is used. LSB method is used to hide the encrypted message into images where as PSNR and MSE are used to measuring the quality of images. As a result, the proposed method gives better results than simple LSB with higher PSNR and lower MSE.<br>
In <a href="#p-7">[7]</a> to increase the authentication of data and security in a network environment cryptographic algorithm (RC4 AND SUFFLING CIPHER) was implemented to encrypt the secret image before embedding it in the RGB cover image with the goal that is difficult to intruder to detect the encryption. This analytical approach was introduced by May H.Abood to ensure the encryption and decryption using RC4 stream cipher and RGB pixel suffling with steganography by using hash-least significant bit(HLSB).It make use of hash function to insert data bits in LSB of RGB pixel of cover image. For secret image peak signal to noise ratio(PSNR) is infinity and Mean square Error (MSE) is 0, for cover image PSNR is 63 and MSE is 0.03.<br>
In <a href="#p-8">[8]</a> an efficient idea was proposed by Zeena N Al-Kateeb, Muna Jaffer Al-Shamdeen and Farah Saad Al-Mukhtar for encrypting important data based on circular shapes information extracted from cover image. The process of encryption is done by using traditional method considering the centre of circle as keys which was extracted from the cover image to reduce the number of keys that was exchanged between sender and recipient to increase the level of security and confidentiality. The above analytical experiment achieves a complete data recovery where BER=0 (BIT ERROR RATE).<br>
In <a href="#p-9">[9]</a>, This paper, a high capacity data embedding approach by the combination of Steganography and cryptography is proposed. In the process a message is first encrypted using transposition cipher method and then the encrypted message is embedded inside an image using LSB insertion method. The combination of these two methods will enhance the security of the data embedded. This combinational methodology will satisfy the requirements such as capacity, security and robustness for secure data transmission over an open channel. The stego images are tested by transmitting them and the embedded data are successfully extracted by the receiver. The main objective in this paper is to provide resistance against visual and statistical attacks as well as high capacity.
</p>
  
<a name="desc-3"></a>
## System Requirements
**Minimum Hardware Requirements**
<pre>
<b>Processor:</b> Intel Dual Core CPU @ 1.60 GHz
<b>RAM:</b> 512 MB of RAM @ 1.60 GHz
<b>Hard Disk:</b> 80 GB
</pre>

**Software Requirements**
<pre>
<b>Operating System:</b> Windows 7 / 8 / 10
<b>Tool Used:</b> Java 8
<b>Memory Required:</b> 60 MB
</pre>

<a name="desc-4"></a>
## Theoretical Background
<p align="justify">
The term Steganography refers to the art of covert communications. By implementing steganography, it is possible for Alice to send a secret message to Bob in such a way that no-one else will know that the message exists. Typically, the message is embedded within another object known as a cover Work, by tweaking its properties. The resulting output, known as a stegogramme is engineered such that it is a near identical perceptual model of the cover Work, but it will also contain the hidden message.<br>
It is this stegogramme that is sent between Alice and Bob. If anybody intercepts the communication, they will obtain the stegogramme, but as it is so similar to the cover, it is a difficult task for them to tell that the stegogramme is anything but innocent. It is therefore the duty of steganography to ensure that the adversary regards the stegogramme - and thus, the communication - as innocuous.<br>
One of the oldest examples of steganography dates back to around 440 BC in Greek History. Herodotus, a Greek historian from the 5th Century BC, revealed some examples of its use in his work entitled "The Histories of Herodotus". One elaborate example suggests that Histaeus, ruler of Miletus, tattooed a secret message on the shaven head of one of his most trusted slaves. After the hair had grown back, the slave was sent to Aristagorus where his hair was shaved and the message that commanded a revolt against the Persians was revealed In this example, the slave was used as the carrier for the secret message, and anyone who saw the slave as they were sent
to Aristagorus would have been completely unaware that they were carrying a message. As a result of this, the message reached the recipient with no suspicion of covert communication ever being raised.<br>
In modern terms, steganography is usually implemented computationally, where cover Works such as text files, images, audio files, and video files are tweaked in such a way that a secret message can be embedded within them. The techniques are very similar to that of digital watermarking; however, one big distinction must be highlighted between the two. In digital 7 watermarking, the focus is on ensuring that nobody can remove or alter the content of the watermarked data, even though it might be plainly obvious that it exists.<br>
Steganography on the other hand, focuses on making it extremely difficult to tell that a secret message exists at all. If an unauthorized third party is able to say with high confidence that a file contains a secret message, then steganography has failed.<br>
Steganography also differs from cryptography because the latter does not attempt to hide the fact that a message exists. Instead, cryptography merely obscures the integrity of the information so hat it does not make sense to anyone but the creator and the recipient. The adversary will be able to see that a message exists, and the inverse process of cryptanalysis involves trying to turn the meaningless information into its original form. With this said, it is still highly likely that a complete steganographic system might employ cryptographic measures as a safety-net to protect the content of the message in the event that the steganography is broken.
</p>

<a name="desc-5"></a>
## Overview of Cryptography
<p align="justify">
‘Cryptography’ this word is originated from the Greek words ‘kryptos’ meaning hidden and ‘graphein’ meaning writing. So, Cryptography is the practice of hiding messages into secret form and how to retrieve the original one from the secret one. Cryptography and the use of secret codes began thousands of years ago to communicate secretly and securely.<br>
The history of cryptography begins where many old tales do…. in ancient Egypt with hieroglyphics. These were not meant to hide messages so much as to give a formal and ceremonial touch to stories of everyday events. During the industrial age, cryptography was moved from a manual exercise to one done by machines. The invention of cipher disks and rotors for this use allowed for the creation of much more complex algorithms.<br>
Cryptography prior to the modern age was effectively synonymous with encryption, the conversion of information from a readable state to apparent nonsense. The originator of an encrypted message shared the decoding technique needed to recover the original information only with intended recipients, thereby precluding unwanted persons to do the same.<br>
Until modern times cryptography referred almost exclusively to encryption, which is the process of converting ordinary information (called plaintext) into unintelligible text (called cipher text). Decryption is the reverse, in other words, moving from the unintelligible cipher text back to plaintext. A cipher (or cypher) is a pair of algorithms that create the encryption and the reversing decryption. The detailed operation of a cipher is controlled both by the algorithm and in eachinstance by a "key". This is a secret (ideally known only to the communicants), usually a short string of characters, which is needed to decrypt the cipher text. A "cryptosystem" is the ordered list of elements of finite possible plaintexts, finite possible cipher texts, finite possible keys, and the encryption and decryption algorithms which correspond to each key. Keys are important, as ciphers without variable keys can be trivially broken with only the knowledge of the cipher used and are therefore useless (or even counter-productive) for most purposes.
</p>

<a name="desc-6"></a>
## Types of Cryptography
Modern Cryptography is of 3 types.<br>
<center>
<img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-1.png" style="display: block; margin-left: auto; margin-right: auto;"></img>
</center>
<p align="center">Figure I. Types of Cryptography</p>
<p align="justify">
<b>a) Symmetric / Public key cryptography</b> is a group of cryptographic algorithms where using the same key a message is encrypted on the sender side and decrypted on the receiver side. The encryption and decryption key are same; that is why this is known as public key cryptography. Again, this type of cryptography is divided into two different types. One is block cipher (plain text is divided into fixed or variable length of blocks and encryption is applied on each and every block) and another is stream cipher (a stream of keys is generated and then using them encryption is applied). This was the only kind of encryption publicly known until June 1976.Only agents with the secret key can encrypt or decrypt the data. Some popular symmetric key cryptographic algorithms are AES, DES, etc. An example is given in Figure II.
</p>
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-2.png"></img></center>
<p align="center">Figure II. Symmetric/Public key cryptography</p>
<p align="justify">
b) Asymmetric / Private key cryptography is a group of cryptographic algorithms where different keys are used for encryption and decryption process. This is also known as private key cryptography because encryption and decryption keys are not same; rather we can say they are private. A significant disadvantage of symmetric ciphers is the key management necessary to use them securely. Each distinct pair of communicating parties must, ideally, share a different key, and perhaps each cipher text exchanged as well. In a groundbreaking 1976 paper, Whitfield Diffie and Martin Hellman proposed the notion of public-key (also, more generally, called asymmetric key) cryptography in which two different but mathematically related keys are used—a public key and a private key. A public key system is so constructed that calculation of one key (the 'private key') is computationally infeasible from the other (the 'public key'), even though they are necessarily related. Instead, both keys are generated secretly, as an interrelated pair. Some popular asymmetric key cryptographic algorithms are RSA, Diffie-Hellman, etc. An example is given in Figure III.
</p>
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-3.png"></img></center>
<p align="center">Figure III. Asymmetric/Private key cryptography</p>
<p align="justify">
<b>c) Hashing</b> is a technique where a mathematical function is taken, generally known as hash function. By applying the hash function plain text is converted into cipher text. A cryptographic hash function is an algorithm that takes an arbitrary amount of data input—a credential—and produces a fixed-size output of enciphered text called a hash value, or just “hash.” That enciphered text can then be stored instead of the password itself, and later used to verify the user.<br>
Certain properties of cryptographic hash functions impact the security of password storage.<br> 
Non-reversibility, or one-way function. A good hash should make it very hard to reconstruct the original password from the output or hash.<br>
Diffusion, or avalanche effect. A change in just one bit of the original password should result in change to half the bits of its hash. In other words, when a password is changed slightly, the output of enciphered text should change significantly and unpredictably.<br>
Determinism. A given password must always generate the same hash value or enciphered text.<br>
Collision resistance. It should be hard to find two different passwords that hash to the same enciphered text.<br>
Non-predictable. The hash value should not be predictable from the password. Some popular hashing algorithms are SHA-256, MD5, etc.<br>
A particular cryptographic algorithm from any of the above categories must assure some parameters in order to consider it as a strong algorithm. The parameters are key-length, confusion and diffusion, external factors for system design, etc.<br>
<b>Cryptanalysis:</b> Cryptanalysis refers to the process of analyzing information systems in order to understand hidden aspects of the systems. Cryptanalysis is used to breach cryptographic security systems and gain access to the contents of encrypted messages, even if the cryptographic key is unknown.<br>
In addition to mathematical analysis of cryptographic algorithms, cryptanalysis includes the study of side-channel attacks that do not target weaknesses in the cryptographic algorithms themselves, but instead exploit weaknesses in their implementation.<br>
Even though the goal has been the same, the methods and techniques of cryptanalysis have changed drastically through the history of cryptography, adapting to increasing cryptographic complexity, ranging from the pen-and-paper methods of the past, through machines like the British Bombes and Colossus computers at Bletchley Park in World War II, to the mathematically advanced computerized schemes of the present. Methods for breaking modern cryptosystems often involve solving carefully constructed problems in pure mathematics, the best-known being integer factorization.<br>
</p>

## Transposition Cipher
<p align="justify">
Classically ciphers that rearranged the letters of plaintext were called transposition ciphers. They can be recognized because ciphertext letter frequencies are the same as plaintext letter frequencies. In a simple columnar transposition cipher, the plain text is written row-wise in a table.The key is an integer that specifies the number of letters in a row in the table. The table is then read column-wise.
For example , let’s the plain text is “attack at dawn” and the key is 4. The plaintext is then written in the table like the following:
</p>
<div align="center">
<img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/transposition_cipher.jpg"></img>
</div>
<p align="center">Tabel I. Transposition Cipher</p>
<p align="justify">
The ciphertext is obtained by reading down the columns in the order of the numbered columns (which are alphabetically ordered).
</p>
<p align="center">actwtk nt d aaa</p>

<a name="desc-7"></a>
## Overview of Steganography
<p align="justify">
The word ‘steganography’ originated from the Greek word ‘steganographia’. This word was first ever founded in the year 1499 in the book of a Greek author named Johannes Trithemius. This word is basically a combination of two separate words. ‘steganos’ means hiding or hiding within something and ‘graphia’ means writing. So, steganography is the practice of hiding messages inside any medium, etc. The particular medium such as text, image, audio, video within which the message is to be hidden is known as cover medium. To provide an extra layer of security, the original message is also changed into some secret message and then it is hidden inside the cover medium. Steganography based communication over easily accessible platforms to prevent leakage of information. Here, embedding of information in a cover image is shown below:
</p>
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-4.png"></img></center>
<p align="center">Figure IV. Stego System</p>
<p align="justify">
Information is added by the sender and if the receiver wants to get the original image, then he needs to extract the embedded image with the help of the secret information provided by the sender. When the receiver will receive the file will be in the embedded form and by extracting it he or she can use or read the original object file which is sent by the sender. This embedding of the binary code is different for the different types of the files.
</p>

<a name="desc-8"></a>
## Types of Steganography
Based on the cover medium there are different types of steganography which are given below in the Figure V.
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-5.png"></img></center>
<p align="center">Figure V. Types of Steganography</p>
<p align="justify">
In modern steganography, especially digital steganography becomes popular and stand apart from others. In digital steganography, different multimedia files are used to hide the message. Due to the large media file size; it is also hard to find the message within the cover medium. There are several techniques of doing the digital steganography. They are given below in the Figure VI.
</p>
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-6.png"></img></center>
<p align="center">Figure VI. Steganography Techniques</p>
<p align="justify">
Within these techniques, spatial and transform domain techniques are mostly used.<br>
</p>
<ul>
  <li><b>Image Steganography</b></li>
  <p align="justify">
  <br><b>a) LSB</b> stands for Least Significant Bit steganography. In this technique, least significant bits are replaced with the message bits so that the minimum  distortion will be resulted in the cover medium and which is imperceptible to the human eye. In Figure VII an example is given.
  </p>
  <center>&emsp;&emsp;&emsp;&emsp;<img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-7.png"></img></center>
  <p align="center"><br>Figure VII. LSB Steganography on Lena Image</p>
  <p align="justify">
  <b>b) PVD</b> stands for Pixel Value Differencing. Two pixels are chosen from the cover medium and it is checked that whether they are belonging to the smooth area 
  or an edge. Then the distortion is calculated by the pixel value difference. Then the message bit is hidden on those pixels.<br>
  <b>c) BPC</b> stands for Binary Complexity Pattern analysis. In this technique the message bits are changed into binary pattern and then the noisy area of the cover   medium is replaced by this pattern. The Human visual system has such a special property that a too-complicated visual pattern cannot be perceived as "shape-     
  informative." For example, on a very flat beach shore every single square-foot area looks the same - it is just a sandy area, no shape is observed. However, if
  you look carefully, two same-looking areas are entirely different in their sand particle shapes. BPCS-steganography makes use of this property. It replaces complex   
  areas on the bit-planes of the vessel image with other complex data patterns (i.e., pieces of secret files). This replacing operation is called "embedding." No one 
  can see any difference between the two vessel images of before and after the embedding operation.<br>
  An issue arises where the data to be embedded appears visually as simple information, if this simple information replaces the complex information in the original 
  image, it may create spurious 'real image information'. In this case the data is passed through a [binary image conjugation transformation], in order to create a 
  reciprocal complex representation.<br>
  <b>d) DCT</b> stands for Discrete Cosine Transform. In this technique, cover medium like image is transformed into frequency domain from spatial domain. Using this     technique, an image is broken into basic images as sinusoidal function. During the process, the secret message is hidden in DCT coefficients. A discrete cosine 
  transform (DCT) expresses a finite sequence of data points in terms of a sum of cosine functions oscillating at different frequencies. The DCT, first proposed by  
  Nasir Ahmed in 1972, is a widely used transformation technique in signal processing and data compression. It is used in most digital media, including digital images 
  (such as JPEG and HEIF, where small high-frequency components can be discarded), digital video (such as MPEG and H.26x), digital audio (such as Dolby Digital, MP3 
  and AAC), digital television (such as SDTV, HDTV and VOD), digital radio (such as AAC+ and DAB+), and speech coding (such as AACLD, Siren and Opus).<br>
  <b>e) DFT</b> stands for Discrete Fourier Transform. This is also similar as the previous technique. The discrete Fourier transform (DFT) converts a finite sequence 
  of equally-spaced samples of a function into a same-length sequence of equally-spaced samples of the discrete-time Fourier transform (DTFT), which is a complex-
  valued function of frequency. The interval at which the DTFT is sampled is the reciprocal of the duration of the input sequence.<br>
  <b>f) DWT</b> stands for Discrete Wavelet Transform. It is any wavelet transform for which the wavelets are discretely sampled. In this technique the high and low 
  frequency regions of an image is detected and based on it the message is hidden in a particular portion which results in a minimum distortion. As with other wavelet 
  transforms, a key advantage it has over Fourier transforms been temporal resolution: it captures both frequency and location information (location in time). These 
  all techniques are used to implement steganography but not directly. Some algorithm is used with these techniques to make it stronger and variant. These 
  steganographic algorithms must assure some parameters like PSNR (Peak Signal to Noise Ration), MSE (Mean Squared Error), imperceptibility, bit error rate, 
  robustness, etc. to make sure that it is a secure algorithm. 
  </p>
  <li><b>Audio Steganography</b></li>
  <p align="justify">
  <br>In audio steganography, secret message is embedded into digitized audio signal which result slight altering of binary sequence of the corresponding audio file. There 
  are several methods are available for audio steganography. Some of them are as follows -<br>
  <b>a) Phase coding</b> is a scheme where the phase of carrier file is replaced with reference phase which represents hidden data. In parity coding signals are 
  divided into regions, then parity bit of each region calculated and matched with secret message bit. Depending on parity matching result encoding is done.<br>
  <b>b) Spread spectrum</b> technique spreads hidden data through the frequency spectrum. Spread spectrum (SS) is a concept developed in data communications to ensure 
  a proper recovery of a signal sent over a noisy channel by producing redundant copies of the data signal. Basically, data are multiplied by an M-sequence code known 
  to both sender and receiver, then hidden in the cover audio. Thus, if noise corrupts some values, there will still be copies of each value left to recover the hidden 
  message. In conventional direct sequence spread spectrum (DSSS) technique was applied to hide confidential information in MP3 and WAV signals. Spread spectrum is
  combined to phase shifting in order to increase the robustness of transmitted data against additive noise and to allow easy detection of the hidden data.   
  Appropriately chosen sub-band coefficients were selected to address robustness and resolve synchronization uncertainty at the decoder.<br>
  <b>c) Tone coding</b> focuses on the frequency masking in audio by using tone insertion method. Inserting tones at known frequencies and at low power level (depends 
  on the original audio power) then modulate the secret massage into this inserted tone. The hidden information is imperceptible so a listener is unable to distinguish 
  between the cover- and the stego-audio signal. So, the cover is audio and the hidden data (secret massage) is the English language text document. The proposed method 
  focuses on the payload of the host audio with no disruption of robustness and imperceptible. The payload has been increased using new algorithm relay on new stego-
  table and using frequent pattern detection into ANSI code. Also, there are other techniques like Wavelet coefficient, low bit encoding, echo coding, etc.
  </p>
  <li><b>Text Steganography</b></li>
  <p align="justify">
  <br>Text steganography is a mechanism of hiding secret text message inside another text as a covering message or generating a cover message related with the original 
  secret message. There are three main categories used to hide text-in-text messages, that is, format based, random, and statistical generations and linguistic method.
  </p>
  <li><b>Video Steganography</b></li>
  <p align="justify">
  <br>Video steganography comprises two procedures which are the embedder and detector. The embedder has two data sources, which are payload implying the amount of secret 
  message inserted inside a cover, and the cover video is utilized as a cover that contains the message inside it. Most methods of steganography implement the hiding 
  operation on the cover without selecting better pixels. The correct selecting of pixels for hiding data achieves a high quality and robustness. Steganography has 
  many techniques to hide the information. One of them is the least significant bit (LSB) method. The main disadvantages of this technique are the serial selection of 
  pixels within the frame that is used for embedding the information inside it and the weakness against electronic attacks. For this reason, the knight tour algorithm 
  was utilized for random selection of pixels and also a key function encryption method used to encrypt a secret message to increase the security and the robustness 
  for the proposed method. After that, the stego video is made as an outcome of the embedding process and will be sent to the recipient. The detector represents the 
  second procedure where the stego video represents the input to this procedure, and the detector can find the secret message by utilizing an extraction procedure.
  </p>
  <center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-8.png"></img></center>
  <p align="center"><br>Figure VIII. Video Steganography Flowchart</p>
  <li><b>IP Datagram Steganography</b></li>
  <p align="justify">
  <br>This is another approach of steganography, which employs hiding data in the network datagram level in a TCP/IP based network like Internet. Network Covert 
  Channel is the synonym of network steganography. Overall goal of this approach to make the stego datagram is undetectable by Network watchers like sniffer, Intrusion 
  Detection System (IDS) etc. In this approach information to be hide is placed in the IP header of a TCP/IP datagram. Some of the fields of IP header and TCP header 
  in an IPv4 network are chosen for data hiding.
  </p>
  <center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/fig-9.png"></img></center>
  <p align="center"><br>Figure IX. IP Datagram Steganography</p>
</ul>

<a name="desc-9"></a>
## Proposed Method
<b>Columnar Transposition</b><br>
<p align="justify">
Our project proposed a new method of embedded secret message into image; it is combined between cryptography and steganography in order to provide higher capacity, robustness, and security.
First the plain text will be encrypted by transposition cipher method. In this transposition cipher method, the plaintext is written row wise in a matrix of given size, but is read out column wise in a specific order depending on a key. Key is something the sender and the recipient agree on
beforehand. Key tells the size of the matrix. To encrypt plaintext the transposition cipher writes
the message in a rectangle, row by row, and reads the message off, column by column, but
permutes the order of the columns based on the key. Both the length of the rows and the
subsequent arrangement of the columns are defined by either a keyword or numerical key. In a
regular columnar transposition cipher, any extra spaces are filled with nulls and in an irregular
columnar transposition cipher, the spaces are left blank.
Classically ciphers that rearranged the letters of plaintext were called transposition ciphers. They can be recognized because cipher text letter frequencies are the same as plaintext letter frequencies. In a simple columnar transposition cipher, the plain text is written row-wise in a table. The key is an integer that specifies the number of letters in a row in the table. The table is then read column-wise.
For example, let’s the plain text is “attack at dawn” and the key is 4. The plaintext is then written in the table like the following:
</p>
<div align="center">
<img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/columnar_transposition.jpg"></img>
</div>
<p align="center">Tabel II. Transposition Cipher</p>
<p align="justify">
The ciphertext is obtained by reading down the columns in the order of the numbered columns (which are alphabetically ordered).
</p>
<p align="center">Tk nactwt d aaa</p>
<p align="justify">
The above algorithm is called <b>Columnar Transposition.</b><br>
Procedure for singe columnar transposition cipher:<br>
1. Chose a key of a fixed length (Length must be less or equal 4).<br>
2. Write the plain text row-by-row in rectangular form but with a fixed column which is equal to the chosen key.<br>
3. Re-arrange the column into alphabetical column using the key as the determinant.<br>
4. Read the message column-by-column.<br>
5. The message read becomes the cipher text.<br>
</p>
<b>Embedding Algorithm</b><br>
<p align="justify">
I have used a LSB Steganography algorithm where I converted a msg word into 8 bits. Now I take 3 pixel at a time and each pixels have 3 channels Red, Green, and Blue. In each channel's last bit is changed with the word bit so 3 pixels and each pixel have 3 channel and their last bit so total 3*3*1 = 9 bits so the words 8 bit is hidden inside this 9 bits and the last 1 bit decides where the message ends. If the last bit is 0 then message continues and if it is 1 then this is the end of the message. <br>
1. Convert the message word into an 8-bit binary representation.<br>
2. Load the image file that you want to hide the message in.<br>
3. Iterate through the pixels of the image, processing three pixels at a time.<br>
4. For each group of three pixels, iterate through the three color channels (Red, Green, Blue).<br>
5. Extract the last bit from each channel's color value in the pixel.<br>
6. Replace the last bit of each channel's color value with the corresponding bit from the message word.<br>
7. Repeat this process for all three pixels, effectively hiding 8 bits of the message word in the image.<br>
8. After processing each group of three pixels, check the last bit of the Blue channel's color value in the third pixel.<br>
9. If the last bit is 0, continue processing the next group of three pixels and append the next 8 bits of the message to the 9 bits of image pixels.<br>
10. If the last bit is 1, this indicates the end of the message. Stop processing the image and finalize the steganography process.<br>
11. Save the modified image with the hidden message.<br>
</p>
</p>
<b>Retrieval Algorithm</b><br>
<p align="justify">
1. Load the image with the hidden message.<br>
2. Iterate through the pixels and color channels as before.<br>
3. Extract the last bit from each color channel's color value.<br>
4. Concatenate the extracted bits to reconstruct the hidden message.<br>
5. Continue extracting the message until the last bit indicating the end of the message is encountered.<br>
6. Display or process the extracted message as needed.<br>
<br>
<b>Note:</b> <I>This algorithm assumes that the image has enough capacity to accommodate the entire message. It's also important to consider the implications of modifying the LSB of the image pixels on the visual quality of the image. Also the key size must be less or equal to 4. Exceeding the key size leads to lossy messages.</I>
</p>

<a name="desc-10"></a>
## Histogram Analysis
<p align="justify">
Histogram analysis in steganography involves analyzing the frequency distribution of pixel values in an image. It is important for image testing as it helps detect any anomalies or alterations caused by steganographic techniques. By comparing the histograms of the original and modified images, deviations in pixel distribution can be identified, indicating the presence of hidden data. Histogram analysis enables the evaluation of steganographic algorithms, assessing their effectiveness in concealing information without significantly affecting the image's visual appearance.<br>
Formula Used to convert red, green, and blue values to greysacale is: 
</p>
<p align="center"><b>luma = 0.299*red + 0.587*green + 0.114*blue</b></p>
<p align="justify">
<b>Histogram of Image Before Hiding The Message (Plain Image): </b> 
</p>
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/plain_img_histogram.png"></img></center>
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/plain_img_histogram_rgb.png"></img></center>
<p align="center"><br>Figure X. Histogram of Plain Image (Before hiding the message)</p>
<p align="justify">
<b>Histogram of Image After Hiding The Message (Stego Image): </b> 
</p>
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/stego_img_histogram.png"></img></center>
<center><img src="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/src/Docs/stego_img_histogram_rgb.png"></img></center>
<p align="center"><br>Figure XI. Histogram of Stego Image (After hiding the message)</p>
<p align="justify">
As can seen above there is almost no visible change between plain image histogram and stego image histogram. This means that the steganographic technique used has successfully concealed the hidden data without causing significant changes to the pixel distribution. In terms of steganography, this is generally considered desirable as it means the modifications made to the image are minimal and difficult to detect visually or through histogram analysis alone. 
</p>

<a name="desc-11"></a>
## Conclusion
<p align="justify">
The steganography is one of the safest forms of data transmissions in this digital world. In our proposed method, image steganography is enhanced more by means of transposition cipher algorithm. The message signal is transmitted with utmost security and can be retrieved without any loss in transmission in this method. Apart from lossless transmission this method easily blinds the hackers securing from data piracy. The advantages of the LSB steganography are clear. It is very simple to implement, and generally quite difficult to detect. Here, we have presented an enhancement of the Image steganography system using LSB approach to provide a means of secure communication.<br>
In our project a new RGB channel based image steganography is proposed. It provides two levels of security, one in the cryptography level and another in the steganography level. The embedding capacity is good. The indicator channel is determined freshly for each pixel. This complexity in the process of embedding, the attacker cannot retrieve the value of the original text without knowing the length of the message and Method of embedding. In this way, the system was strengthened using LSB approach to provide a means of secure communication. The strength of Steganography lies in the sheer amount of information that changes hands every day. It is very simple using digital technology to conceal any given digital information within other information, so virtually anything could contain a hidden meaning. There is no practical way to check it all. However, none of steganography methods we examined could resist a concerted attack if someone knew that there was a message in a given document. For the greatest level of secrecy, we have used the combination of both steganography and cryptography.
</p>

<a name="desc-12"></a>
## Future Scope
1. A strong stegoystem can be built from the proposed method.
2. The key size in symmetric key cryptography can be increased currently the max key size limit is 4.
3. Instead of double level; multilevel encryption can be applied with this technique to make the proposed method more secure.

<a name="desc-13"></a>
## References
<p align="justify">
<a name="p-1"></a>
[1]. Ako Muhammad Abdulla, Roza Hikmat Hama Aziz; New Approaches to Encrypt and Decrypt Data in Image using Cryptography and Steganography Algorithm International Journal of Computer Applications · June 2016<br>
<a name="p-2"></a>
[2]. Aumreesh Kumar Saxena, Sitesh Kumar Sinha, Piyush Kumar Shukla; Design and Development of Image Security Technique by Using Cryptography and Steganography: A Combine Approach, International Journal of Image, Graphics and Signal Processing · April 2018<br>
<a name="p-3"></a>
[3]. Hayfaa Abdulzahra Atee, Robiah Ahmad; Combining Cryptography and Steganography for Data Hiding in Images, Conference Paper · April 2014<br>
<a name="p-4"></a>
[4]. May Hattim, An efficient image cryptography using hash-LSB steganography with RC4 and
pixel shuffling encryption algorithms, Conference Paper · March 2017<br>
<a name="p-5"></a>
[5]. Zin May Zawa, and Su Wai Phyo, “Security Enhancement System Based on the Integration of Cryptography and Steganography”<br>
<a name="p-6"></a>
[6]. HAYFAA ABDULZAHRA, ROBIAH AHMAD1, NORLIZA MOHD NOOR, “Combining Cryptography and Steganography for Data Hiding in Images”<br>
<a name="p-7"></a>
[7]. May H. Abood, “An Efficient Image Cryptography using Hash-LSB Steganography with RC4 and Pixel Shuffling Encryption Algorithms”<br>
<a name="p-8"></a>
[8]. Zeena N. Al-kateeb, Muna Jaffer AL-Shamdeen, and Farah Saad Al-Mukhtar, “Encryption and Steganography a secret data using circle shapes in colored images”<br>
<a name="p-9"></a>
[9] .Shamim Ahmed Laskar ,Kattamanchi Hemachandran “High Capacity data hiding using
LSB Steganography and Encryption”
</p>

# License

<b><a href="https://github.com/Soumabha-Banerjee/EnigmaticByte/blob/main/LICENSE.md">Click here</a></b> to see the license.
