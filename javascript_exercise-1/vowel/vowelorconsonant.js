function vowel(character)
{
    character=character.toLowerCase();
    if(character==='a'||character==='e'||character==='i'||character==='o'||character==='u')
    {
        return true;
    }
    else{
        return false;
    }
}

alert(vowel(prompt("Please Enter a character to check whether it is vowel or consonant! ")));