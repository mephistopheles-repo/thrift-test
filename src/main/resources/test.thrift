namespace java tutorial

exception ThrowableEx {
    1:i32 code
    2:string reason
}

struct resultDto {
     1:i32 c
     2:string sc
}

struct Dto {
    1:i32 a
    2:i32 b
    3:string sa
    4:string sb
}

service SomeService {
    i32 add(1:i32 a,2:i32 b)
    string strCat(1:string a,2:string b)
    resultDto addDto(1:Dto dto)
    void throwEx() throws (1:ThrowableEx e)
}

