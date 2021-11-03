/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarynetwork;

import java.io.UnsupportedEncodingException;
import java.util.*;
import java.lang.instrument.Instrumentation;
/**
 *
 * @author user
 */
public class Dictionarynetwork {
private static Instrumentation instrumentation;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        long start;
        long end;
        long elapsedTime;
        
        start = System.nanoTime();
        List<Integer> compressed = compress("23524117594545442695868770481153457570535432064049118048208817904799037777468613794111491539599507630022642927933967161579445987393817578830271518003858589717449368461152544961509833767611370680219030311905526978911249279304898344824760219574013813173145431116930408459852777331099626253657844941509938605069789379638356882039475149590779493384556613494745470500108280434273708571588569227912513682308193087843858181817710208695580821082781953310048336263043490560050261533050973621284900257600447542517985152778287219275336161726469712852692516377931244928800959301043939424783432421571591821804775994931732984448853342457763095530471522319400896147451226182683881721762719030135903900026694311029522171715393432954788743484694974931060600736340238751611379700384446002201316593545395192884035227779484532884178943269271934127419644315237792910091743605765024002695862884743040807484588277400864525407884028176389207272424717507736054592921668284264480854725272439467679616731189501351541994776796817151682291927010355600881726637940880789643919520590067278504873575942584830493507702391409010551846406912128352018502709246294824420153728145814356846484166116390729773451116234296633694716742711460015643601654584743946295369842920967916417299400970231120156769319259356863971211891984219944564813021898703631970861700485129650159650282059521910816945164695685219951525700460274137428973084624556725471329325188135562192670866226034925529417174488433034081278869698099163537954152204798254575626348260335971558820138058249151632703744532718608445334146158672426164572523325520437425499206094470935907392826996321356109594020665725822433469268149650710605571216912298277401538547459106593735167179784923517726842448079401524746858725149685534795492000551772443683838454361438700747043535815456801783998185931945102966956482978609523786192300230746738068223383995156226444598893647407495094783576733776850535763968992952322201921698774478633344590178813876987416413129641948757305429214661484702550539141448228742265361187083471660109389182307829359042116328311631785061185139035452826809932642036076821461906564994400631252580219342080825851925628217487129618573508110091616735278417874646545918944192839333238353332683080547829479461931111452073574225478078635619867976554079634518066162596637988701655017351245362348289270712520440286383790408787147255960112763903122941854985117970130262010472177115009840821622916495801433077831811728190358496948984753123306772062300770979858581714040871627488551475482114377047797784143348653722601574681147416274313981460535440049483884435760175228988138003498474884765210398343777873855854882751997817975063863907411041960727888522708481058551528073090006329154305919588003992834689408379234003469916019890823638024664527529239354597364523595250534886024467482426407021408632123524995273370718061947838459404638056113847426918000904452317564712456090704433393925619660613774779214372261570434583603642366187564949769216672799741315776552893866411412784025566216043747550789212168696013364517277203025952270348936493322389390344607546257834483645972250767579868065568397322163828181371832216489468041877003466415759372119757424048216803560467262523004150004558241990305764671132326662086326436410291247318458729121405561808217397211332821369590492046290594945861857979050614698869713984092600548377222296552765193622778366794000886632094609460556295263898818406258939297646910186400942888222693450875454847686031494310334255806103292777518880051342684439097396127831415711343559133096699331123879175299039290280082744826924748212572242129891553379890044685168686438808268291462242929198678423919515361749832630934744002273035442417954393028691261866473537897254754869903016557464405729426182750783385338314916275246106462453600227562673566306051711966717077108996302138393652430990978635981400580393263148557618873205316115450306465733902657465140195570586923806523066067664006217988275685114747666376921482538413824145014404773390588411033365001322088012180406047926202639426807214984632669239827169586581847901374058263481827351884386404757162244951691269622675074312963660569024552395625652932032284432207346385141457396753126611985638775906770171581359804129779976667754150896902745071450454397771093831712871943767074591480202489400619296555652295663816694352326764177473120145729289285449922097625287051326186607434831443517030048913242112970712277259843017984584019232813582636833371485273938124360945323361663829184926349519048552468894546579804751646738536871746792430567774198863212112054410242865403747650586970504474970297779072188911460203863665112529801605583147130878120950735660368539332449391560808917459201878174467655038861838131661785468809873339742320983617943357366778695836767074050889844957704123739726048411719227807006708851541924731809899400742296485018549793150969553051869196437876874871531664231330719424237658162994635678533205519240494606715894575910206663238856607789083586268751611063874896186045043207139412888834517421082550577098222624825957953133");
       end = System.nanoTime();
        String com=compressed.toString();
        elapsedTime = end - start;
        
        System.out.println(com+"   "+"Time: "+elapsedTime+" Size: "+compressed.size()*8);
        
        start = System.nanoTime();
        String decompressed = decompress(compressed);
        end = System.nanoTime();
        elapsedTime = end - start;
        System.out.println("Decompress Time: "+elapsedTime);
    }
    
    
    
    
    
    public static List<Integer> compress(String uncompressed) {
        // Build the dictionary.
        int dictSize = 256;
        Map<String,Integer> toshow = new HashMap<String,Integer>();
        Map<String,Integer> dictionary = new HashMap<String,Integer>();
        for (int i = 0; i < 256; i++){
            dictionary.put("" + (char)i, i);
            
        }
        
 
        String w = "";
        List<Integer> result = new ArrayList<Integer>();
        for (char c : uncompressed.toCharArray()) {
            String wc = w + c;
            if (dictionary.containsKey(wc))
                w = wc;
            else {
                result.add(dictionary.get(w));
                // Add wc to the dictionary.
                dictionary.put(wc, dictSize++);
                toshow.put(wc, dictSize-1);
                w = "" + c;
            }
        }
 
        // Output the code for w.
        if (!w.equals(""))
            result.add(dictionary.get(w));
        
       /* dictionary.entrySet()
	.stream()
	.forEach(System.out::println);
        System.out.println();
        
        toshow.entrySet()
	.stream()
	.forEach(System.out::println);
        System.out.println();*/
        return result;
    }
    
    
    
    public static String decompress(List<Integer> compressed) {
        // Build the dictionary.
        int dictSize = 256;
        Map<Integer,String> dictionary = new HashMap<Integer,String>();
        for (int i = 0; i < 256; i++)
            dictionary.put(i, "" + (char)i);
 
        String w = "" + (char)(int)compressed.remove(0);
        StringBuffer result = new StringBuffer(w);
        for (int k : compressed) {
            String entry;
            if (dictionary.containsKey(k))
                entry = dictionary.get(k);
            else if (k == dictSize)
                entry = w + w.charAt(0);
            else
                throw new IllegalArgumentException("Bad compressed k: " + k);
 
            result.append(entry);
 
            // Add w+entry[0] to the dictionary.
            dictionary.put(dictSize++, w + entry.charAt(0));
 
            w = entry;
        }
        return result.toString();
    }
    
}
