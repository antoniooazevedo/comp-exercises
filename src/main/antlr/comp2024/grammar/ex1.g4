grammar ex1;

@header {
    package pt.up.fe.comp2024;
}

INTEGER : [0-9]+ ;
IP : [0-255].[0-255].[0-255].[0-255] ;

program
    : IP EOF
    ;
