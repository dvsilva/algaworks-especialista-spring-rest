# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 26-18-testando-envio-de-email
git add .
git commit -m "Testando o envio de e-mail"
git push origin 26-18-testando-envio-de-email

git checkout master
git merge --no-ff 26-18-testando-envio-de-email
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