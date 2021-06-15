;.source Test.j
.class public static Test
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 100
.limit locals 100
	ldc 0
	istore 0
L1: 
	iload 0
	ldc 10
	if_icmpge L2
	; print the value.
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "entrou"
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	iload 0
	ldc 1
	iadd
	istore 0
	iload 0
	ldc 5
	if_icmple L3
	; print the value.
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "a maior > q 5: "
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 0
	invokevirtual java/io/PrintStream/print(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
	goto L4
L3:
	; print the value.
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc "a menor < q 5: "
	invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	iload 0
	invokevirtual java/io/PrintStream/print(I)V
	getstatic java/lang/System/out Ljava/io/PrintStream;
	ldc " "
	invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L4:
	goto L1
L2:
return
.end method
