JavaArrayCovariance
===================

A short example of Java's array covariance.  This is considered a flaw in the design of the Java language.  Ideally, Java should exhibit subtype invariance, in which an array of type "X array" is a subtpe of "Y array" only if X <: Y and Y <: X.  However, Java only checks the former (X <: Y, called covariance), which means the compiler will not check certain array assignments for type safety.  This check is done at runtime and can result in the ArrayStoreException being thrown.
