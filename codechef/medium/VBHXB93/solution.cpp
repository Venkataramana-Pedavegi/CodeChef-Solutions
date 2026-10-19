const uppercaseMiddleware = (req, res, next) => {
    if (res.locals.message) {
    res.locals.message = res.locals.message.toUpperCase();
    }
    next();
    };

    // Register middlewares in order
    app.use(messageMiddleware);
    app.use(uppercaseMiddleware);
    app.get('/', (req, res) => {
        res.send(res.locals.message);
        });

        app.listen(port, () => {
        console.log(`Server running at http://localhost:${port}`);
        });
    
