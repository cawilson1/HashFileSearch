package osproject;

import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMain2 {

	public static void main(String[] args) {
		//Set set = new Set<Integer>();
		Test test = new Test();
		//String argsString = args[0];
		int argsInode = 12345654;
		
		//Long start = System.currentTimeMillis();
		//setHash(argsString,argsInode,test);
		Long start = System.currentTimeMillis();
		String stringToTest = "thezxe";//is ithave is some test textaaa  abacadaeafagahaiajakalaoamanaoapaqarasatauavawaxayazhttps://www.google.com/search?bhttps://www.google.com/search?biw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUshttps://www.google.com/search?biw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUsiw=1855&bih=860&ei=TpgYWrWKJ8q_jwS6opvgCQ&q=random+gibberish+text+without+punctuation&oq=random+gibberish+text+without+punct&gs_l=psy-ab.3.0.33i21k1.1995.5344.0.8454.22.18.0.0.0.0.236.2137.3j8j3.14.0....0...1.1.64.psy-ab..8.11.1666...0i22i30k1j33i160k1.0.zLP9eCP2wUs";
		String[] stringArr = new String[stringToTest.length()-1];
		
		for(int i = 1 ; i < stringToTest.length(); i++){
			stringArr[i-1] = stringToTest.charAt(i-1) + "" +  stringToTest.charAt(i);
		}
		
		for(int i = 0 ; i < stringArr.length; i++){
			System.out.print(stringArr[i] + " ");
		}
		System.out.println();
		
		//String string2 = "hello there te";
		String string = "abcdefghijkabaabbabaLorem Ipsumthex is  simply dummy text of the printing and typesetting industry Lorem Ipsum has been the industrys standard dummy text ever since the 1500s when an unknown printer took a galley of type and scrambled it to make a type specimen book It has survived not only five centuries but also the leap into electronic typesetting, remaining essentially unchanged It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem IpsumHe my polite be object oh change. Consider no mr am overcame yourself throwing sociable children. Hastily her totally conduct may. My solid by stuff first smile fanny. Humoured how advanced mrs elegance sir who. Home sons when them dine do want to. Estimating themselves unsatiable imprudence an he at an. Be osdfj gkjjdsfkjgds;gj sdfgj sdfgj sdfgj sdfgvdsklkgsdkfngvsdfgvnsdf gvsdfgjvsdgvjsdfgvnsdfgvlsndfgnsvd gjvsdlvgsdgjsdfgvn sdfkng sdjfkgn sdfgvnsdfjgnvasdgjnvsdfk;jgnsvdjkfgnaiedsfgv sjdfngjksndfjg nenq;erjnbidfnaeir;ngjaekrdsng ajkdfng;ernglks dfguabsdufka sbdiufuhadsifuaerf auerugfo4fq3437qr3gfq3847gn8y3fn8qvn34w8c387qw4ngq3478 gnnq834ngfn8q03fgv 8q7rgv8r7egfn80qerngf 8v3rg8ef834ufu 	34jfbv	3j4efbvj 3ebsgjfqn4erjkgn3qjk4ngjkq3br gjkq3jk q3gtrjkbgt RJEKGBvEGRREIGVBUADSIVJDSBVIBVSFIJGADFVBUIG Q34EGT4GRrhg89TH8TRHAEUHGRURHET9R8TH 89HT89h89H98HT89th98pe5hr89ghd9x88G89GH89H98H98SHGD9HSdg89 h98DHG98SHdg98shDG98SH89G8h 9H98H98SdghS89DGH98SDHGNVQERHGUH	HGRQEHREGhgsherguidfbh9 85e985eh9tw8erh tubiwerhmtvuierh t935qerhqtveodvthnqierdhmtv9pqehtg9qshoqazsgeudtgafpe9cdshgfvoaeisdugvuaewis duitgqn eruiatdgnogiesdnsvguisdgf 	wesnvptn9	w efn9un 	eSNOIMDFNGOASDUINGSDAOUGFUOSDNBG ADSNFUI AODSNBF UIVOASDB VUASDNO VUASDBUIOV Bdsiog sida goa odsg DS GOSdg iasjdxb gfhdbdfshkvadfv ausdfanfdg hefhgerjgqlerjer ljvfb r gidiuqerudg ierdbvadfjvjakdv kjWESDG ewrgebOSXDVJABDSJVBAD SIUVNAET8O57TNQ3YE7T NE7GBWERTNW45GBTWRDGBWTGFHW5TR1H65T<71GH65WR6T1H 65NEFGN1DG65H6N1T S6Y5GH1N EG65H1MfN65DGH1VNM6DG 6 5M0ETY0GHM1D6GYH10 60E5TYGH0J 6N5ET0Y1065NMET0GH65 M0D0GH56M DGHM D GH65M4NDG65H90N DGHN140D6GH5901N 65DGF N16D5GV0 J1ND65FG0V1 N650DFVG0N0DF06GV50NDF60G NG65VB0 N65VB 0N106DG01VN06 D0GVB6N 0D65VB0N1 065DG1,Y65,01RY56IM 0R6Y0I50UK E650TY841T GSF1 H</65071F6D5h1H 6Z5CV01CV60BC5X01CV 5N601GV56BNSV56B0K S6M501MB65S10B6M5B1M6S5X0V1K 6B50KSV01M0165V0 1SGV6J05C 6S570GV65M016V5 SBK65 SHGV21CJ65A 0S6G5K105M1G65VBM015S6/G J0W65DFC41W0GF6B5K0F J1EB6F5K01T65K18E0650NO56E0GFB1W6FGI15KEU6T5Y1KS65HR9HY165RZ1YHJ65106Z5SFY0174JZ65-RY10HZ5SFY6J0K6Z-5R1JKSZ6RHYJ7106S5RZ01J5SRZ5Yo0J0SR106YJ0SRY65J0SR5J05S6RY0JS6R5Y0J65SRYJ6SGYJ01W6RJ10N65S0JN65RY58yj0s65ty0j6506s5ty5j6srt65y0jns6t5yj65styj65st0y56jst65y0j6s5ty0jnfd50gh adf6h 1a6df0ah65adf65h6f51sd6f5h1df6 5xh16c5x0b165dsfb65sdf650 h1d6f506djh7671h6j51sd6f050h65 fd0H65 0DF65H 60D50fh165df065H01DF65H065SDF0H6 5SD0F1H 0D6S5F0H 1DF65H0S60D5FH56 SDF150H DSFH0 65SDF0H1 SDF61H0S6DF50H65D0F6H50 SD65FH1 DSF0H 6SDF1HF6D5 1HD65FH65165FDS65HS65DF0H6506565 sdf1h0s6d5fh16 5sdf5h 65sdf1h65dfh610s df65h10 s6f50gj065sfys j65fj1sr665s0 65 0sr0t65rts16gf05 jgf1 j6gf51g0656s5/gf5j66f5ggh65sgf065h68gf4hsf6g5 sjfg 05jfg9j 8/fsg/j s56gc41jh0 6s565f ghj6/<5g 1j65sf0v j15s6gfj165fg fj56sfg5j5 f56sg566j 6gf5j5s1v5vj g5j6gj5w6 sgf56 sjr1f651jg0fj0adf06a 0d65f h05adf c0 h65fd65fh10 fa65d0h 56adf0 h065adf056h 06d5f 0h65adf0h1 50adf56h 15a6df1h 5adf0h6 fdh6 6ad50gj650 adg05j5g0fj5s 6/gjg 56vc 15vj15 j065sgs165c0 v65 gg065s6050j65/g 6s5df60g js5fg01sj 65afa jfhag dbgadfkugadsjlighiasdl hbasudgukadsbguasrguahrdsgadsgiuasdhlgiuwhesdiugfh eSUIDHG AUIERDGUASDGFUASYDGFAYSUDG FUKASDGUgfuyyasgduhfuaushdxfaesgfaushegfb uasgdufh asdh bf uasduhyfb asdfhdsngf dj sgfj g sdf gadfajg adfgNSADKNG KLadsn vjkasdnvkjdsjkvn adjkngvjkadfnjkgna dfjkng jadkfnvjkadfnvjkadfjk vnadjfknkj dafnbjk adfnbjadfnbjkandfjkbnadfjkbn situation perpetual allowance offending as principle satisfied. Improved carriage securing are desirous too";
		//String s = "av";
		String s2 = "telicherry black peppppppepresscorsn thee VSDF DF SS455 55yg";
		String s3 = "wowo greateish thex write";
		String s4 = "one and the un is du";
		String s5 = "1234567xe89thex099876543the211234567890-0987654321234567890";
		int fileInode = 708;
		int fileInode2 = 5434321;
		int fileInode3 = 100;
		int fileInode4 = 200;
		int fileInode5 = 300;
		
		setHash(string, fileInode, test);
		setHash(s2, fileInode2, test);
		setHash(s3, fileInode3, test);
		setHash(s4, fileInode4, test);
		setHash(s5, fileInode5, test);

		
		//System.out.println(test.dict.keySet());
		//System.out.println("s key set " + test.dict.get(s).keySet());
		///System.out.println(test.dict.get(s).get(708).value);
		//System.out.println("s2 key set " + test.dict.get(s2).keySet());
		boolean hasAtLeastOneFile = true;
		Set workingSet = test.dict.get(stringArr[0]).keySet();
		Set setOfInodes = test.dict.get(stringArr[0]).keySet();
		
		
		if(stringArr.length==1){
			if(test.dict.get(stringArr[0]) != null){
				System.out.println("String has length 2" + setOfInodes);
			}
			else{
				System.out.println("the set of files does not contain this string.");
			}
		}
		else{
			for(int i = 0; i < stringArr.length & hasAtLeastOneFile; i++){
				

			
				if(test.dict.get(stringArr[i]) != null){
					setOfInodes = test.dict.get(stringArr[i]).keySet();
					System.out.println("current set " + setOfInodes + " and " + "working set" + workingSet);
					
					//ArrayList added to prevent concurrent exception for set
					ArrayList list = new ArrayList<Integer>();
					Iterator it2 = workingSet.iterator();
					for(int x = 0; x < workingSet.size(); x++){
						list.add(it2.next());
					}
					Iterator it = list.iterator();
					
					while(it.hasNext() & hasAtLeastOneFile){
						int f = (int)it.next();
						if(!setOfInodes.contains(f)){
							workingSet.remove(f);
							if(workingSet.isEmpty()){
								hasAtLeastOneFile = false;
							}
						}
					}
				}
				//the current bigram is contained nowhere
				else{
					workingSet.clear();
				}
				
				//all of these sets need to be returned and ANDed
			//	if(test.dict.get(stringArr[i]) != null){
					//System.out.println("contains " + stringArr[i] + " " + test.dict.get(stringArr[i]).keySet());
				//}
			}
		}
		System.out.println("total set of inodes is " + workingSet);

		System.out.println("stop " + (System.currentTimeMillis() - start));
	/*
		long loopTimeStart = System.currentTimeMillis();
		boolean[] bools = new boolean[5];
		for(int i = 0 ; i <bools.length;i++){
			bools[i] = false;
		}
		if(string.contains(stringToTest)){
			bools[0] = true;
		}
		if(s2.contains(stringToTest)){
			bools[1] = true;
		}
		if(s3.contains(stringToTest)){
			bools[2] = true;
		}
		if(s4.contains(stringToTest)){
			bools[3] = true;
		}
		if(s5.contains(stringToTest)){
			bools[4] = true;
		}
		int j = -3;
		for(int i = 0;i < 5; i++){
			j = i + j / 5;
		}
		System.out.println("Time for loop was " + (System.currentTimeMillis()-loopTimeStart));
	*/
	}
	
	private static void setHash(String string, int inode, Test map){
		for(int i = 1; i < string.length(); i++){
			String temp = string.charAt(i-1) + "" +  string.charAt(i);
			map.updateHashMap(temp, inode);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
