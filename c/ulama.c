#include <stdio.h>
#include <string.h>

int SesliMi(char ch){
	char *sesli= "aeiouAEIOU";
	if(strchr(sesli, (int)ch) != NULL)
		return 1;
	return 0;
}
int SessizMi(char ch){
	char *sessiz = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWYZ";
	if(strchr(sessiz, (int)ch) != NULL) 
		return 1;
	return 0;
}
int BoslukMu(char ch){
	if(ch == ' ')
		return 1;
	return 0;
}
int UlamaVarMi(char *ch1){
	if(SessizMi(ch1[0]) && BoslukMu(ch1[1]) && SesliMi(ch1[2]))
		return 1;
	return 0;
}
int UlamaSay(char *mtn){
	int ulama = 0, i = 0;
	while(mtn[i+2] != '\0'){
		if(UlamaVarMi(&mtn[i]))
			ulama++;
		i++;
	}
	return ulama;
}
int main(void){
	char metin[] = "Kugu, ordekgiller ailesine ait, iri ve beyaz su kusu\
	turlarinin ortak adidir.";
	int ulama;
	ulama = UlamaSay(metin);
	printf("Ulama sayisi : %d\n", ulama);
	getchar();
	return 0;
}
	
	

