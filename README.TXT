------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: Cryptography
PURPOSE OF PROJECT: Show different public key cryptography algorithms
VERSION or DATE: 1
DEPENDENCIES: none
HOW TO START THIS PROJECT: run main method in Message exchange class
AUTHORS: Alex Eastman
USER INSTRUCTIONS: 

there is a bug where messages longer than 5 characters dont encrypt and decrypt properly 
i think this has something to do with the string classes interaction with byte array conversion
(so in other words not really my fault)

if the names in message exchange are changed to generic it will simulate a non encrypted transfer.


reference on modular arithmatic, this is very basic
http://en.wikipedia.org/wiki/Modular_arithmetic

explanation of the process
http://en.wikipedia.org/wiki/RSA_(cryptosystem)#Operation

the extended euclidean algorithm
http://en.wikipedia.org/wiki/Extended_Euclidean_algorithm
which is used for computing
http://en.wikipedia.org/wiki/Modular_multiplicative_inverse
which is used in the key generation step
my "hacky" version of this is in the rsa keygenerator


Mod power function
http://en.wikipedia.org/wiki/Modular_exponentiation
used in encrytpion and decryption of keys, found in RSA_encrypter


this incorporates polymorphic class design, algorithm development, simulations, and
numerical methods

the abstract classes allow for polymorphic design of message exchange, 
the algorithms used to create the crypto system show use of development
the message exchange class runs a simulated message exchange
the various algorithms are implementations of known numerical methods