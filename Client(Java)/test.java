import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class test {
	public static void main(String[] args) {
		System.out.println(sendPost("http://127.0.0.1:5000/register"));
	}
	 public static String sendPost(String url) {
	        String TAG = "uploadFile";
	        int TIME_OUT = 10*10000000; //超时时间
	        String CHARSET = "utf-8"; //设置编码
	        String SUCCESS="1";
	        String FAILURE="0";
	        String PREFIX = "--" , LINE_END = "\r\n";
	        String BOUNDARY = "----WebKitFormBoundary7MA4YWxkTrZu0gW"; //边界标识 随机生成
	        String CONTENT_TYPE = "multipart/form-data"; //内容类型
	        PrintWriter out = null;
	        BufferedReader in = null;
	        String result = "";
	        try {
	            URL realUrl = new URL(url);
	            // 打开和URL之间的连接
	            HttpURLConnection conn = (HttpURLConnection) realUrl.openConnection(); conn.setReadTimeout(TIME_OUT); conn.setConnectTimeout(TIME_OUT);
	            conn.setDoInput(true); //允许输入流
	            conn.setDoOutput(true); //允许输出流
	            conn.setUseCaches(false); //不允许使用缓存
	            conn.setRequestMethod("POST"); //请求方式
	            conn.setRequestProperty("Charset", CHARSET);
	            //设置编码
	            conn.setRequestProperty("connection", "keep-alive");
	            conn.setRequestProperty("Content-Type", CONTENT_TYPE + "; boundary=" + BOUNDARY);
                OutputStream outputSteam=conn.getOutputStream();
                DataOutputStream dos = new DataOutputStream(outputSteam);
                StringBuffer sb = new StringBuffer();
                sb.append(PREFIX);
                sb.append(BOUNDARY); sb.append(LINE_END);
                /**
                 * 这里重点注意：
                 * name里面的值为服务器端需要key 只有这个key 才可以得到对应的文件
                 * filename是文件的名字，包含后缀名的 比如:abc.png
                 */
                sb.append("Content-Disposition: form-data; name=\"name\""+LINE_END);
                sb.append(LINE_END);
                sb.append("wsun"+LINE_END);
                sb.append(LINE_END);
                sb.append(PREFIX);
                sb.append(BOUNDARY); sb.append(LINE_END);
                /**
                 * 这里重点注意：
                 * name里面的值为服务器端需要key 只有这个key 才可以得到对应的文件
                 * filename是文件的名字，包含后缀名的 比如:abc.png
                 */
                sb.append("Content-Disposition: form-data; name=\"password\""+LINE_END);
                sb.append(LINE_END);
                sb.append("1993430"+LINE_END);
                sb.append(PREFIX);
                sb.append(BOUNDARY); sb.append(PREFIX);                
                dos.write(sb.toString().getBytes());
                dos.flush();
	            in = new BufferedReader(
	                    new InputStreamReader(conn.getInputStream()));
	            String line;
	            while ((line = in.readLine()) != null) {
	                result += line;
	            }
	        } catch (Exception e) {
	            System.out.println("发送 POST 请求出现异常！"+e);
	            e.printStackTrace();
	        }
	        //使用finally块来关闭输出流、输入流
	        finally{
	            try{
	                if(out!=null){
	                    out.close();
	                }
	                if(in!=null){
	                    in.close();
	                }
	            }
	            catch(Exception ex){
	                ex.printStackTrace();
	            }
	        }
	        return result;
	    }    
	}

