# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 26-25-resolvendo-problema-de-sessao-com-spring-session-e-redis
git add .
git commit -m "Resolvendo problema de sessão com Spring Session e Redis"
git push origin 26-25-resolvendo-problema-de-sessao-com-spring-session-e-redis

git checkout master
git merge --no-ff 26-25-resolvendo-problema-de-sessao-com-spring-session-e-redis
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```

configurar hosts

127.0.0.1       api.algafood.local
127.0.0.1       auth.algafood.local
127.0.0.1       www.algafood.local
127.0.0.1       www.matafome.local
127.0.0.1       www.foodanalytics.local

gerar encode (https://bcrypt-generator.com)
algafood-web - web123
foodanalytics - food123
faturamento - faturamento123