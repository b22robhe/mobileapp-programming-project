
# Rapport - SolarSystemApp



## Jag har gjort det följande:

- Lagt till data i kursens webbtjänst.
- Hämtar datan genom JsonTask klassen och parsar den genom GSON.
- GSON lägger datan i en "Planet" klass med diverse attribut.
- Datan presenteras i applikationen genom en RecyclerView med hjälp av en RecyclerViewAdapter.
- Lagt till en "about" sida med hjälp av en till aktivitet tillsammans  med en intent.
- About sidan är en html fil som visas i aktiviteten med en webview.

## Kodexempel:
Lagt till kod i RecyclerViewAdapter för att presentera mer data än bara namn. Och användning av "ImageLoader" biblioteket för att hämta bilder från en URL.
```
        holder.category.setText(items.get(position).getCategory());
        holder.moons.setText(items.get(position).getMoons());
        holder.surfaceArea.setText(items.get(position).getSurfaceArea());
        
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(items.get(position).getImageURL(), holder.imageURL);
```

  I "onPostExecute" så parsar vi datan med GSON och skapar en adapter och sätter adaptern på viewen
```
        Gson gson = new Gson();
        Type type = new TypeToken<List<Planet>>() {}.getType();
        planets = gson.fromJson(json, type);

        adapter = new RecyclerViewAdapter(this, planets, new RecyclerViewAdapter.OnClickListener() {
            ...
        });

        view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        view.setAdapter(adapter);
```

När "About" aktiviteten startar så laddas en lokal hemsida in i webviewn.
```
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        WebView myWebView;
        myWebView = findViewById(R.id.about_webview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("file:///android_asset/about.html");
    }
```



![](main.png)
Bild av appen när man öppnar den

![](picture_loading.png)
Bild av appen när en bild laddas

![](about.png)
Bild av appens about sida