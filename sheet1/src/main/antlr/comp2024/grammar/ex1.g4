grammar ex1;

@header {
    package pt.up.fe.comp2024;
}

INTEGER : [0-9]+ ;
OCTET : [0-9] | [0-9][0-9] | '1' [0-9][0-9] | '2' [0-4][0-9] | '25' [0-5] ;
IP : OCTET '.'OCTET '.'OCTET '.'OCTET ;

program
    : IP EOF
    ;
