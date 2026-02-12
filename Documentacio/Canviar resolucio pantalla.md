# Com canviar la resolució de la pantalla

- Primer executem lacomanda xrandr per veure quins adaptadors hi ha
- Després amb cvt {amplada} {alçada} {refresc} (per exemple: cvt 1920 1080 60) ens dona una línia que hem de copiar, com aquesta:
    "1920x1080_60.00"  173.00  1920 2048 2248 2576  1080 1083 1088 1120 -hsync +vsync
- Executar la següent comanda amb la línia anterior:
    sudo xrandr --newmode {línia anterior}
- Tot seguit toca executar:
    sudo xrandr --addmode {nom de l'adaptador que funciona} {qualitat entre cometes de la línia}
- I ja estaria :)
