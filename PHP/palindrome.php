<?php

$a = "kasur";
$b =  strrev($a);

    $string_reverse = str_split($b);
    $palin = '';

    foreach($string_reverse as $value){
        $palin.= $value; 
    }
    print $palin;

    if($a == $palin){
        print "<br>Palindrome";
    } else {
        print "<br>Not Palindrome"; 
    }
?>