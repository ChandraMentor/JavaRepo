
This document is for those people who believe in doing things in different
way to achieve new heights ( we mean to say that who want to show that
they are different from crowd). We request such students to go thr'u this
documentation. To understand this document u need to know little bit
about pointers in c and macros.


This Document tells u how to understand the implementation of file io classes in jre.

If u open the files like FileInputStream.c every thing can be very easily understood excpet
the statement where the authors has used the unhand macro. 

#define	unhand(o)	((o)->data)

unhand is defined as shown above

Here is the explaination regarding one such statement used in java_io_FileInputStream_close
function of FileInputStream.c source file.

unhand(unhand(this)->fd)->fd 

To understand how the above macro is expanded first we need to know
the data type of variable this used in "this" function, the data type
of this is struct Hjava_io_FileInputStream* .

Let us see how the struct is defined

typedef struct Classjava_io_FileInputStream {
  struct Hjava_io_FileDescriptor* fd;
} Classjava_io_FileInputStream;
HandleTo(java_io_FileInputStream);

Again to see how this definition will be expanded we require the definition of HnadleTo macro. Below is HnadleTo macro definition.

#define	HandleTo(class)					\
	typedef struct H##class {			\
		Hjava_lang_Object base;			\
		struct Class##class data[1];		\
	} H##class



Using the above definition we can expand the structure as follows

typedef struct Hjava_io_FileInputStream{
	Hjava_lang_Object base;	
	struct ClassHjava_io_FileInputStream data[1];
} HHjava_io_FileInputStream

This expansion can be understood very easily if u just substitute
java_io_FileInputStream for the word class.

now u can apply the macro unhand(this) which will be converted
as this ->data here in the above data is of type 
struct ClassHjava_io_FileInputStream This has fd as a variable 
which again is a structure pointer in c and if u again apply unhand on the result u will be reaching fd which is defined as jint inside the structure
Classjava_io_FileDescriptor 

typedef struct Classjava_io_FileDescriptor {
  jint fd;
} Classjava_io_FileDescriptor;
HandleTo(java_io_FileDescriptor);

so the above expression unhand(unhand(this)->fd)->fd  is used to access
fd which is of type jint that is defined in fd which is of type structure
Classjava_io_FileDescriptor  and this is a variable inside the structure
java_io_FileInputStream



Note : this document is based of kaffee virtual machine implementation.

Thanks
Team -J
 