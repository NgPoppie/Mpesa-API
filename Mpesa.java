OkHttpClient client = new OkHttpClient();
Request request = new Request.Builder()
import requests
  .url("https://sandbox.safaricom.co.ke/oauth/v1/generate?grant_type=client_credentials")
  .get()
  .addHeader("Authorization", "Basic SWZPREdqdkdYM0FjWkFTcTdSa1RWZ2FTSklNY001RGQ6WUp4ZVcxMTZaV0dGNFIzaA==")
  .build();
Response response = client.newCall(request).execute();
