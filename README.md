# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 22-23-implementando-suporte-a-pkce-com-fluxo-authorization-code
git add .
git commit -m "Implementando o suporte a PKCE com o fluxo Authorization Code"
git push origin 22-23-implementando-suporte-a-pkce-com-fluxo-authorization-code

git checkout master
git merge --no-ff 22-23-implementando-suporte-a-pkce-com-fluxo-authorization-code
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