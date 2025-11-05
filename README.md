# Composepedia
<a><img alt="Version" src="https://badgen.net/static/Version/1.0.0/blue"/></a>

Proyecto de visualización de componentes UI del artifacto UIKIT utilizando _Jetpack Compose_.


## 🚀 Estructura del proyecto

El proyecto está hecho con Astro y nuestra estructura actual es:

```
.
├── public/
├── src/
│   ├── assets/
│   ├── collaborations/
│   ├── content/
│   │   ├── docs/
│   │   │   ├── **componentes**
│   │   └── config.ts
│   └── env.d.ts
├── astro.config.mjs
├── package.json
└── tsconfig.json
```

### Información necesaria

| Command                   | Action                                           |
| :------------------------ | :----------------------------------------------- |
| `npm install`             | Instala las dependencias                         |
| `npm run dev`             | Inicial el servidor en `localhost:4321`          |
| `npm run preview`         | Preview de tu build, hazlo antes de hacer PR     |

- Todos los componentes serán formato `.mdx`
- Las imágenes irán en `src/assets/nombreDelComponente`.

